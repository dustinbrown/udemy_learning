package Vehicle;

/**
 * Created by dbrown on 1/17/17.
 */
public class Firebird extends Car {
    private final Integer MAX_SPEED = 180;
    private final String DRIVETRAIN = "2WD";

    public Firebird(String color, Integer doors) {
        this.color = color;
        this.numberOfDoors = doors;
        setMaxSpeed(MAX_SPEED);
        setDrivetrain(DRIVETRAIN);
    }
}
