package Room;

/**
 * Created by dbrown on 1/17/17.
 */
public class LivingRoom {
    private String colorOfWalls;
    private String typeOfFloor;
    private Couch couch;
    private TV tv;

    public LivingRoom(String colorOfWalls, String typeOfFloor, Couch couch, TV tv) {
        this.colorOfWalls = colorOfWalls;
        this.typeOfFloor = typeOfFloor;
        this.couch = couch;
        this.tv = tv;
    }

    public String isTvOn() {
        return tv.getPowerStatus();
    }

    public void turnTVOn() {
        tv.turnOn();
    }

    public String getColorOfWalls() {
        return colorOfWalls;
    }

    public String getTypeOfFloor() {
        return typeOfFloor;
    }

    public Couch getCouch() {

        return couch;
    }

    public void turnTVOff() {
        tv.turnOff();
    }

}
