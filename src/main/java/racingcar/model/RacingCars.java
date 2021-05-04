package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {
    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }

    public void moveCars() {
        for (RacingCar racingCar : racingCars) {
            racingCar.move();
        }
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public List<RacingCar> getWinners() {
        int maxMileage = racingCars
                .stream()
                .max(RacingCar::compareTo)
                .map(RacingCar::getMileage)
                .orElse(0);

        return racingCars
                .stream()
                .filter(racingCar -> racingCar.getMileage() == maxMileage)
                .collect(Collectors.toList());
    }
}
