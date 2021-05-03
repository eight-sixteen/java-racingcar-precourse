package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RacingCarTest {
    @Spy
    RacingCar racingCar;

    @ParameterizedTest
    @CsvSource(value = {"true:1", "false:0"}, delimiter = ':')
    @DisplayName("전진하면 이동거리가 1 늘어나고, 멈춰있으면 이동거리가 늘어나지 않는다")
    public void test(boolean canMove, int mileage) {
        when(racingCar.isTrackConditionOk()).thenReturn(canMove);

        racingCar.move();

        assertEquals(mileage, racingCar.getMileage());
    }
}
