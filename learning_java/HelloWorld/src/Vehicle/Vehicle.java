package Vehicle;

import java.util.List;

/**
 * Created by dbrown on 1/17/17.
 */
public abstract class Vehicle {
    String drivetrain;
    String color;
    Integer numberOfWheels;
    Integer numberOfDoors;
    Integer maxSpeed;
    Integer currentSpeed;
    List<Integer> gears;
    String currentDirection;

    public void setSpeed(Integer speed) {
        if (speed > getMaxSpeed()) {
            System.out.println("Max speed of " + getMaxSpeed() + " reached!");
            currentSpeed = maxSpeed;
        } else {
            currentSpeed = speed;
        }
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public List<Integer> getGears() {
        return gears;
    }

    public void setGears(List<Integer> gears) {
        this.gears = gears;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }
}
