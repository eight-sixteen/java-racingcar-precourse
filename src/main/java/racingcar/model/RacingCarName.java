package racingcar.model;

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
            throw new IllegalArgumentException("자동차 이름은 5자 이내여야 합니다");
        }
    }
}
