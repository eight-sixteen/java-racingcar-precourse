package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarGameTest {
    @Test
    @DisplayName("차 이름이 다섯글자가 넘으면 예외 발생")
    public void nameError() {
        int validRound = 1;
        List<String> invalidNames = Arrays.asList("다섯글자 넘는 차 이름", "다섯글자 넘는 차 이름2");

        assertThrows(IllegalArgumentException.class, () -> new RacingCarGame(invalidNames, validRound));
    }

    @Test
    @DisplayName("라운드 횟수가 0 이하이면 예외 발생")
    public void roundError() {
        int invalidRound = -10;
        List<String> validNames = Arrays.asList("Brown", "Yellow", "Red");

        assertThrows(IllegalArgumentException.class, () -> new RacingCarGame(validNames, invalidRound));
    }
}