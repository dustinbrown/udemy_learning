import Vehicle.Firebird;

/**
 * Created by dbrown on 1/17/17.
 */
public class FirstCar {
    public static void main(String[] args) {
        Firebird firstCar = new Firebird("black", 2);
        firstCar.setSpeed(1000);
        System.out.println(firstCar.getColor());
        System.out.println(firstCar.getDrivetrain());
        firstCar.setCurrentDirection("Left");
        System.out.println(firstCar.getCurrentDirection());
        System.out.println(firstCar.getCurrentSpeed());
    }
}
