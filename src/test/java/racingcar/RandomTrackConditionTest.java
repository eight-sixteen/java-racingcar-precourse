package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class RandomTrackConditionTest {
    @Test
    @DisplayName("0-9 사이의 랜덤한 숫자 반환")
    public void test() {
        int randomNumber = RandomTrackCondition.generateRandomNumber();

        assertTrue(randomNumber >= 0);
        assertTrue(randomNumber <= 9);
    }

    @CsvSource(value = {"0:false", "1:false", "2:false", "3:false", "4:true", "5:true", "6:true", "7:true", "8:true", "9:true"}, delimiter = ':')
    @ParameterizedTest
    @DisplayName("3 이하의 수이면 멈춤, 4 이상의 수이면 전진")
    public void move(int number, boolean canMove) {
        assertEquals(RandomTrackCondition.canMove(number), canMove);
    }
}
