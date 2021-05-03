import racingcar.RacingCarGame;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        try {
            RacingCarGame racingCarGame = new RacingCarGame(ConsoleView.scanCarNames(), ConsoleView.scanRound());
            racingCarGame.startRace();
        } catch (IllegalArgumentException e) {
            ConsoleView.printErrorMessage(e.getMessage());
        }
    }
}
