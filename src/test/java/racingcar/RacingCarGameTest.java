package racingcar;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarGameTest {
    @Test
    @DisplayName("우승자의 이동거리는 어떤 자동차의 이동거리보다 길거나 같다")
    public void test() {
        RacingCars racingCars = new RacingCars(Lists.list(
                makeRacingCar("a"),
                makeRacingCar("b"),
                makeRacingCar("c"),
                makeRacingCar("d"),
                makeRacingCar("e"))
        );

        for (int i=0; i<5; i++) {
            racingCars.moveCars();
        }

        List<RacingCar> winners = racingCars.getWinners();

        for (RacingCar winner : winners) {
            for (RacingCar racingCar : racingCars.getRacingCars()) {
                assertTrue(racingCar.getMileage() <= winner.getMileage());
            }
        }
    }

    private RacingCar makeRacingCar(String name) {
        return new RacingCar(new RacingCarName(name));
    }
}