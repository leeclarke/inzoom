package meadowhawk.piserver.model

import groovy.transform.ToString

import java.time.Duration
import java.time.LocalDateTime

@ToString
class ZoomCallStats {

    LocalDateTime startTime = LocalDateTime.now()
    LocalDateTime endTime
    Duration totalTime

    def endCall(){
        endCall(LocalDateTime.now())
    }

    def endCall(LocalDateTime timeIn){
        endTime = timeIn
        totalTime =  Duration.between(startTime, endTime)
    }

}