package Room;

/**
 * Created by dbrown on 1/17/17.
 */
public class Couch {
    private String color;
    private Integer numberOfPillows;
    private String size;

    public String getColor() {
        return color;
    }

    public Integer getNumberOfPillows() {
        return numberOfPillows;
    }

    public String getSize() {
        return size;
    }

    public Couch(String color, Integer numberOfPillows, String size) {

        this.color = color;
        this.numberOfPillows = numberOfPillows;
        this.size = size;
    }
}
