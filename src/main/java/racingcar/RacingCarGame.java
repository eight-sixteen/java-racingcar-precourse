package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCarGame {
    private final RacingCars racingCars;
    private final RacingRound racingRound;

    public RacingCarGame(List<String> names, int round) {
        this.racingCars = new RacingCars(names.stream()
                .map(RacingCarName::new)
                .map(RacingCar::new)
                .collect(Collectors.toList()));
        this.racingRound = new RacingRound(round);
    }

    public void startRace() {
        while (!racingRound.isFinalRound()) {
            racingCars.moveCars();
            racingRound.nextRound();
        }
    }

    public List<RacingCar> getWinners() {
        return racingCars.getWinners();
    }
}
