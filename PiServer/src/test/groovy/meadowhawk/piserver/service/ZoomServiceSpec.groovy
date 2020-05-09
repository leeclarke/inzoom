package meadowhawk.piserver.service

import groovy.json.JsonSlurper
import meadowhawk.piserver.model.ZoomCallStats
import spark.Request
import spock.lang.Specification

import java.time.LocalDateTime

class ZoomServiceSpec  extends Specification{

    def "The Json Generator should produce Json for the ZoomCallsStatus object but handling LocalDateTime and Duration"(){
        given:
            ZoomService zoomService = new ZoomService()
            ZoomCallStats call1 = new ZoomCallStats()
            call1.endCall(LocalDateTime.now().plusMinutes(20).plusHours(1).plusSeconds(42))
            ZoomCallStats call2 = (new ZoomCallStats())
            call2.endCall(LocalDateTime.now().plusMinutes(10))
            zoomService.zoomStatsLog = [call1, call2]
        when:
            def jsonStr = zoomService.jsonGen.toJson(zoomService.zoomStatsLog)
        then:
            assert jsonStr != null

            def json = (new JsonSlurper()).parseText(jsonStr)
            assert json[0].totalTime == "1:20:42"
    }

    def "When making multiple toggle on/offs each call is properly recorded to the log."(){
        given:
        ZoomService zoomService = new ZoomService()
        Request request = Mock(Request)
        request.queryParamsValues(ZoomService.STATUS) >>> [["on"],["off"],["on"],["off"]]

        when:
        zoomService.toggleIndicator(request)

        then:
        assert zoomService.currentCall != null
        assert zoomService.zoomStatsLog.size() == 0

        when:
        zoomService.toggleIndicator(request)

        then:
        assert zoomService.currentCall == null
        assert zoomService.zoomStatsLog.size() == 1

        when:
        zoomService.toggleIndicator(request)

        then:
        assert zoomService.currentCall != null
        assert zoomService.zoomStatsLog.size() == 1

        when:
        zoomService.toggleIndicator(request)

        then:
        assert zoomService.currentCall == null
        assert zoomService.zoomStatsLog.size() == 2
        assert !zoomService.zoomStatsLog[0].endTime.equals(zoomService.zoomStatsLog[1].endTime)

    }
}
