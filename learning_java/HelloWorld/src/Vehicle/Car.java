package Vehicle;

/**
 * Created by dbrown on 1/17/17.
 */
public class Car extends Vehicle {
    private Integer MAX_SPEED = 100;
    @Override
    public void setNumberOfWheels(Integer numberOfWheels) {
        super.setNumberOfWheels(4);
    }

    @Override
    public void setMaxSpeed(Integer maxSpeed) {
        super.setMaxSpeed(MAX_SPEED);
    }
}
