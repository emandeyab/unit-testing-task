package stopwatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void givenLessThan60Seconds_whenRecord_thenStoredAsSecondsOnly() {
        // Arrange
        StopWatch stopWatch = new StopWatch();

        //Act
        stopWatch.record(35);

        //Assert
        Assertions.assertEquals(35, stopWatch.getSeconds());
        Assertions.assertEquals(0, stopWatch.getMinutes());
        Assertions.assertEquals(0, stopWatch.getHours());
    }

    @Test
    void givenMoreThan60Seconds_whenRecord_thenConvertToMinutes() {
        //Arrange
        StopWatch stopWatch = new StopWatch();
        //Act
        stopWatch.record(75);
        //Assert
        Assertions.assertEquals(15, stopWatch.getSeconds());
        Assertions.assertEquals(1, stopWatch.getMinutes());
        Assertions.assertEquals(0, stopWatch.getHours());
    }

    }
