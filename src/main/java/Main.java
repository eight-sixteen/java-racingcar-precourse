import racingcar.RacingCar;
import racingcar.RacingCarGame;
import view.ConsoleView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> carNames = ConsoleView.scanCarNames();
            int round = ConsoleView.scanRound();

            RacingCarGame racingCarGame = new RacingCarGame(carNames, round);
            racingCarGame.startRace();

            List<RacingCar> winners = racingCarGame.getWinners();
            ConsoleView.printWinners(winners);
        } catch (IllegalArgumentException e) {
            ConsoleView.printErrorMessage(e.getMessage());
        }
    }
}
