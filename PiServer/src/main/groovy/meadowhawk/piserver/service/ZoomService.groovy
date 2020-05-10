package meadowhawk.piserver.service

import groovy.json.JsonGenerator
import groovy.util.logging.Slf4j
import meadowhawk.piserver.model.ZoomCallStats
import static  meadowhawk.piserver.util.DurationUtil.*
import spark.Request

import java.time.Duration
import java.time.LocalDateTime

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME

@Slf4j
class ZoomService {
    static final String STATUS = "callStatus"
    List<ZoomCallStats> zoomStatsLog = new LinkedList<>()
    ZoomCallStats currentCall
    GIPOService gipoService = new GIPOService()

    String getStatusInfo(){
        jsonGen.toJson(zoomStatsLog)  //TODO: Expand results to included total time and maybe an HTML output option
    }

    void toggleIndicator(Request request){

        def status =  request.queryParamsValues(ZoomService.STATUS)?.contains("on") ? "on": "off"
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
