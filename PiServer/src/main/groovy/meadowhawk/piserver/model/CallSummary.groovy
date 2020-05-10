package meadowhawk.piserver.model

import java.time.Duration

class CallSummary {
    List<ZoomCallStats> zoomCalls
    Duration totalCallTime
    int totalCalls

}
