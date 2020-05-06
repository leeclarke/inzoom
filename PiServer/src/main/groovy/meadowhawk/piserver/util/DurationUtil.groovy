package meadowhawk.piserver.util

import java.time.Duration

import static java.time.LocalTime.MINUTES_PER_HOUR
import static java.time.LocalTime.SECONDS_PER_MINUTE

//Duration helper since  running java 8
class DurationUtil {

    static public int toMinutesPart(Duration duration){
        return (int) (duration.toMinutes() % MINUTES_PER_HOUR);
    }

    static public int toSecondsPart(Duration duration){
        return (int) (duration.getSeconds() % SECONDS_PER_MINUTE);
    }

    static public int toHoursPart(Duration duration){
        return (int) (duration.toHours() % 24);
    }
}
