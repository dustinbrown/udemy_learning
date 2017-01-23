package Room;

/**
 * Created by dbrown on 1/17/17.
 */
public class Visitor {
    public static void main(String[] args) {
        Couch comfyCouch = new Couch("brown", 4, "large");
        LivingRoom myLivingRoom = new LivingRoom("blue", "hardwood", comfyCouch, new TV(51));
        myLivingRoom.turnTVOn();
        System.out.println("number of pillows on couch: " + myLivingRoom.getCouch().getNumberOfPillows());
        System.out.println("Tv is " + myLivingRoom.isTvOn());
    }

}
