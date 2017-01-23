package Room;

/**
 * Created by dbrown on 1/17/17.
 */
public class TV {
    private Integer size;
    private String powerStatus;

    public Integer getSize() {
        return size;
    }

    public String getPowerStatus() {
        return powerStatus;
    }

    public TV(Integer size) {
        this.size = size;
        this.powerStatus = "off";
    }


    public void turnOn() {
        powerStatus = "on";
        System.out.println("Turning tv on");
    }
    public void turnOff() {
        powerStatus = "off";
        System.out.println("Turning tv off");
    }
}
