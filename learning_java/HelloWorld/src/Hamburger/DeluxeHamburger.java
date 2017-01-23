package Hamburger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dbrown on 1/17/17.
 */
public class DeluxeHamburger extends Hamburger{
    private List<Additions> additions;
    private List<Additions> AllowedAdditions = Arrays.asList(Additions.DRINK, Additions.FRIES);


    @Override
    public void setAdditions(List<Additions> additions) throws Exception {
        super.setAdditions(additions);
    }

    public DeluxeHamburger() throws Exception {
        super("white", "beef", new ArrayList<Additions>(), 2);
        setAdditions(AllowedAdditions);

    }

    public String costBreakDown(){
        return getCostBreakdown();
    }

}
