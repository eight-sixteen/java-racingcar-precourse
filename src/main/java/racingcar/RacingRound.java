package racingcar;

public class RacingRound {
    private final int finalRound;
    private int round;

    public RacingRound(int finalRound) {
        validate(finalRound);

        this.round = 0;
        this.finalRound = finalRound;
    }

    private void validate(int finalRound) {
        if (finalRound < 1) {
            throw new IllegalArgumentException("라운드 횟수는 1 이상 이어야 합니다");
        }
    }

    public void nextRound() {
        round++;
    }

    public boolean isFinalRound() {
        return round == finalRound;
    }
}
