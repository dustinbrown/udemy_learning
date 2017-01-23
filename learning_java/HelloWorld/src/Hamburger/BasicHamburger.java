package Hamburger;

import java.util.List;

/**
 * Created by dbrown on 1/17/17.
 */
public class BasicHamburger  extends Hamburger{
    private List<Additions> additions;

    @Override
    public void setAdditions(List<Additions> additions) throws Exception {
        super.setAdditions(additions);
    }

    public BasicHamburger(List<Additions> additions) throws Exception {
        super("white", "beef", additions, 4);

    }

    public String costBreakDown(){
        return getCostBreakdown();
    }

}
