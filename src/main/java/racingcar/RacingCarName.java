package racingcar;

public class RacingCarName {
    private final String name;

    public RacingCarName(String name) {
        validate(name);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void validate(String name) {
        if (name == null || name.length() > 5) {
            throw new IllegalArgumentException("RacingCarName length must be under 5");
        }
    }
}
