package meadowhawk.piserver.service

import groovy.json.JsonGenerator
import groovy.util.logging.Slf4j
import jdk.jfr.Frequency
import meadowhawk.piserver.model.ZoomCallStats
import spark.Request

import java.time.Duration
import java.time.LocalDateTime

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME

@Slf4j
class ZoomService {
    static final String STATUS = "callStatus"
    static List<ZoomCallStats> zoomStatsLog = new LinkedList<>()
    static ZoomCallStats currentCall
    static GIPOService gipoService = new GIPOService()

    String getStatusInfo(){
        jsonGen.toJson(zoomStatsLog)
    }

    //status=oof|on
    void toggleIndicator(Request request){
        def status = (request.queryParams().contains(STATUS))? request.queryParamsValues(STATUS): "off"
        if(status.contains("on")){
            log.info("Status=ON")
            if(currentCall) endCall()
            currentCall = new ZoomCallStats()

            gipoService.toggleLED(true)
        } else { //Disable led
            log.info("Status=OFF")
            endCall()
        }
    }

    def endCall(){
        currentCall.endCall()
        zoomStatsLog.add(currentCall)
        currentCall == null

        gipoService.toggleLED(false)
    }

    def jsonGen = new JsonGenerator.Options()
            .addConverter(LocalDateTime) {
                it.format(ISO_LOCAL_DATE_TIME)
            }.addConverter(Duration) {
                "${it.toMinutes()}:${it.toMinutes()}"
            }
            .build()
}
