package racingcar;

import com.google.common.annotations.VisibleForTesting;

public class RacingCar implements Comparable<RacingCar>{
    private final RacingCarCondition racingCarCondition;
    private final RacingCarName racingCarName;
    private final Mileage mileage;

    public RacingCar(RacingCarName racingCarName) {
        this.racingCarName = racingCarName;
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

    public String getName() {
        return racingCarName.getName();
    }

    @VisibleForTesting
    boolean canMove() {
        return racingCarCondition.canMove();
    }

    @Override
    public int compareTo(RacingCar o) {
        return Integer.compare(this.getMileage(), o.getMileage());
    }
}
