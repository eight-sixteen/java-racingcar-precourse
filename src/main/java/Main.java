import racingcar.RacingCarGame;
import racingcar.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        try {
            RacingCarGame racingCarGame = new RacingCarGame(ConsoleView.scanCarNames(), ConsoleView.scanRound());
            racingCarGame.play();
        } catch (IllegalArgumentException e) {
            ConsoleView.printErrorMessage(e.getMessage());
        }
    }
}
