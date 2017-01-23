package Hamburger;

import java.util.List;

/**
 * Created by dbrown on 1/17/17.
 */
public class HealthyHamburger extends Hamburger{
    private List<Additions> additions;

    @Override
    public void setAdditions(List<Additions> additions) throws Exception {
        super.setAdditions(additions);
    }

    public HealthyHamburger(List<Additions> additions) throws Exception {
        super("wheat", "tofo", additions, 6);

    }

    public String costBreakDown(){
        return getCostBreakdown();
    }

}
