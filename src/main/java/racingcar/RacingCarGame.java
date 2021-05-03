package racingcar;

public class RacingCarGame {
    private final RacingCars racingCars;
    private final RacingRound racingRound;

    public RacingCarGame(int round) {
        this.racingCars = new RacingCars();
        this.racingRound = new RacingRound(round);
    }

    public void startRace() {
        while (!racingRound.isFinalRound()) {
            racingCars.moveCars();
            racingRound.nextRound();
        }
    }
}
