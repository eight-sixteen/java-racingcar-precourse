package racingcar;

import racingcar.model.RacingCar;
import racingcar.model.RacingCarName;
import racingcar.model.RacingCars;
import racingcar.model.RacingRound;
import racingcar.view.ConsoleView;

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

    public void play() {
        while (!racingRound.isFinalRound()) {
            racingRound.nextRound();
            racingCars.moveCars();
            ConsoleView.printRacingCars(racingCars);
        }

        ConsoleView.printWinners(racingCars.getWinners());
    }
}
