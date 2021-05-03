package racingcar;

import com.google.common.annotations.VisibleForTesting;

import java.util.Random;

public class RandomTrackCondition {
    private static final int RANDOM_NUMBER_BOUND = 10;
    private static final int MIN_MOVE_NUMBER = 4;

    private static final Random random = new Random();

    public static boolean canMove() {
        return canMove(generateRandomNumber());
    }

    @VisibleForTesting
    static boolean canMove(int number) {
        return number >= MIN_MOVE_NUMBER;
    }

    @VisibleForTesting
    static int generateRandomNumber() {
        return random.nextInt(RANDOM_NUMBER_BOUND);
    }
}
