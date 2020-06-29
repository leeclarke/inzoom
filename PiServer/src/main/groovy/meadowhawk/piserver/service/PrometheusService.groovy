package meadowhawk.piserver.service

import io.prometheus.client.CollectorRegistry
import io.prometheus.client.Counter
import io.prometheus.client.Gauge
import io.prometheus.client.Summary
import io.prometheus.client.exporter.common.TextFormat
import spark.Response

class PrometheusService {
    final CollectorRegistry registry = CollectorRegistry.defaultRegistry
    final ZoomService zoomService

    PrometheusService(ZoomService zoomService){
        this.zoomService = zoomService
    }

    static final Gauge callStatus = Gauge.build()
            .name("zoom_call_status").help("Active transactions.")
            .register()

    static final Counter callReqs = Counter.build()
            .name("zoom_call_count").help("Total Calls").register()

    def String getMetrics(Response resp){
        resp.status(200)
        resp.type(TextFormat.CONTENT_TYPE_004)
        final StringWriter writer = new StringWriter()
        TextFormat.write004(writer, registry.metricFamilySamples())
        writer.toString()
    }
}
