package meadowhawk.piserver.service

import groovy.json.JsonGenerator
import groovy.util.logging.Slf4j
import io.prometheus.client.CollectorRegistry
import io.prometheus.client.exporter.common.TextFormat
import meadowhawk.piserver.model.CallSummary
import meadowhawk.piserver.model.ZoomCallStats
import static  meadowhawk.piserver.util.DurationUtil.*
import spark.Request
import spark.Response

import java.time.Duration
import java.time.LocalDateTime

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME

@Slf4j
class ZoomService {
    static final String STATUS = "callStatus"
    List<ZoomCallStats> zoomStatsLog = new LinkedList<>()
    ZoomCallStats currentCall
    GIPOService gipoService = new GIPOService()
    final CollectorRegistry registry = CollectorRegistry.defaultRegistry

    String getStatusInfo(){
        def totalTime = zoomStatsLog.sum({ it.totalTime})
        CallSummary callSummary = new CallSummary(zoomCalls:zoomStatsLog, totalCallTime:totalTime, totalCalls: zoomStatsLog.size())
        jsonGen.toJson(callSummary)  //TODO: maybe an HTML output option?
    }

    void toggleIndicator(Request request){

        def status =  request.queryParamsValues(ZoomService.STATUS)?.contains("on") ? "on": "off"
        PrometheusService.callStatus.set((status=="on")?1:0)
        if(status == "on"){
            log.info("Status=ON")
            if(currentCall == null) {
                currentCall = new ZoomCallStats()
                gipoService.toggleLED(true)
            } else {
                log.warn("Call already started")
            }
        } else { //Disable led
            log.info("Status=OFF")
            endCall()
        }
    }

    def endCall(){
        if(currentCall) {
            currentCall.endCall()
            zoomStatsLog.add(currentCall)
            PrometheusService.callReqs.inc()
            currentCall = null
        }
        gipoService.toggleLED(false)
    }



    def jsonGen = new JsonGenerator.Options()
            .addConverter(LocalDateTime) {
                it.format(ISO_LOCAL_DATE_TIME)
            }.addConverter(Duration) {
                "${toHoursPart(it)}:${toMinutesPart(it)}:${toSecondsPart(it)}"
            }
            .build()
}
