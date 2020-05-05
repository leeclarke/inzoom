package meadowhawk.piserver.model

import spock.lang.Specification
import java.time.LocalDateTime


class ZoomCallStatsSpec extends Specification {

    def "When calling end on object, values are properly set."(){
        given:
            def obj =  new ZoomCallStats()
        when:
            obj.endCall(LocalDateTime.now().plusMinutes(20))
        then:
            assert obj.endTime != null
            assert obj.totalTime != null
            assert obj.totalTime.toMinutes() == 20
    }
}
