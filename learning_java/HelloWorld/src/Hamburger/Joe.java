package Hamburger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbrown on 1/18/17.
 */
public class Joe {
    public static void main(String[] args) throws Exception {
        List<Additions> additionsList = new ArrayList<Additions>();
        additionsList.add(Additions.CHEESE);
//        additionsList.add(Additions.CHEESE);
//        additionsList.add(Additions.CHEESE);
        additionsList.add(Additions.CHEESE);
        additionsList.add(Additions.DRINK);

        List<Additions> additionsListForHealthy = new ArrayList<Additions>();
        additionsListForHealthy.add(Additions.CHEESE);
        additionsListForHealthy.add(Additions.CHEESE);
        additionsListForHealthy.add(Additions.CHEESE);
        additionsListForHealthy.add(Additions.CHEESE);
        additionsListForHealthy.add(Additions.DRINK);

        BasicHamburger basicHamburger;
        HealthyHamburger healthyHamburger = null;
        DeluxeHamburger deluxeHamburger = null;
        try {
            basicHamburger = new BasicHamburger(additionsList);
            healthyHamburger = new HealthyHamburger(additionsListForHealthy);
            deluxeHamburger = new DeluxeHamburger();
        } catch (Exception e) {
            System.out.println("Illegal order, you get a plain burger!");
            basicHamburger = new BasicHamburger(new ArrayList<>());
        }

        System.out.println(basicHamburger.costBreakDown());
        System.out.println(healthyHamburger.costBreakDown());
        System.out.println(deluxeHamburger.costBreakDown());

    }


}
