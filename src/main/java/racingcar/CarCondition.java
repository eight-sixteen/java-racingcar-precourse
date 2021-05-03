package racingcar;

import com.google.common.annotations.VisibleForTesting;

import java.util.Random;

public class CarCondition {
    private static final int RANDOM_NUMBER_BOUND = 10;
    private static final int MIN_MOVE_NUMBER = 4;

    private final Random random = new Random();

    public boolean canGo() {
        return generateRandomNumber() >= MIN_MOVE_NUMBER;
    }

    @VisibleForTesting
    int generateRandomNumber() {
        return random.nextInt(RANDOM_NUMBER_BOUND);
    }
}
