package racingcar;

public class RacingRound {
    private final int finalRound;
    private int round;

    public RacingRound(int finalRound) {
        this.round = 0;
        this.finalRound = finalRound;
    }

    public void nextRound() {
        round++;
    }

    public boolean isFinalRound() {
        return round == finalRound;
    }
}
