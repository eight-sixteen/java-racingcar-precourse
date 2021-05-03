package racingcar;

import com.google.common.annotations.VisibleForTesting;

public class RacingCar {
    private final RacingCarCondition racingCarCondition;
    private final Mileage mileage;

    public RacingCar() {
        this.racingCarCondition = new RacingCarCondition();
        this.mileage = new Mileage();
    }

    public void move() {
        if (canMove()) {
            mileage.increase();
        }
    }

    public int getMileage() {
        return mileage.getMileage();
    }

    @VisibleForTesting
    boolean canMove() {
        return racingCarCondition.canMove();
    }
}
