package racingcar;

import view.ConsoleView;

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
            racingRound.nextRound();
            racingCars.moveCars();
            ConsoleView.printRacingCars(racingCars);
        }

        ConsoleView.printWinners(racingCars.getWinners());
    }
}
