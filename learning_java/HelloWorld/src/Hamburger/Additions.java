package Hamburger;

/**
 * Created by dbrown on 1/17/17.
 */
public enum Additions {
    CHEESE(.25),
    LETTUCE(.25),
    FRIES(1.00),
    DRINK(1.00),
    PICKLES(.50);

    private final double cost;
    Additions(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
