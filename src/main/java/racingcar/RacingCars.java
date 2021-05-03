package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private final List<RacingCar> racingCars = new ArrayList<>();

    public void moveCars() {
        for (RacingCar racingCar : racingCars) {
            racingCar.move();
        }
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }
}
