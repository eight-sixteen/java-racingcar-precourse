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
        } catch (IllegalArgumentException e) {
            ConsoleView.printErrorMessage(e.getMessage());
        }
    }
}
