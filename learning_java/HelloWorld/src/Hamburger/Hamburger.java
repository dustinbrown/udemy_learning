package Hamburger;

import java.util.List;

/**
 * Created by dbrown on 1/17/17.
 */
public class Hamburger {
    private String rollType;
    private String meat;
    private List<Additions> additions;
    private int numberOfAddtionsAllowed;
    private double initialCost = 2.00;


    public Hamburger(String rollType, String meat, List<Additions> additions, int numberOfAddtionsAllowed) throws Exception {
        this.rollType = rollType;
        this.meat = meat;
        this.additions = additions;
        this.numberOfAddtionsAllowed = numberOfAddtionsAllowed;
        validateNumberOfAdditions();
    }
    private void validateNumberOfAdditions() throws Exception{
        if (additions.size() > numberOfAddtionsAllowed) {
            System.out.println("Only " + numberOfAddtionsAllowed + " items are allowed for the type ordered");
            throw new Exception("Only " + numberOfAddtionsAllowed + " items are allowed for the type ordered");
        }
    }

    public void setAdditions(List<Additions> additions) throws Exception{
        validateNumberOfAdditions();
        this.additions = additions;
    }

    public String getCostBreakdown(){
        double totalCost = additions.stream().mapToDouble(e -> e.getCost()).sum();
        totalCost += initialCost;

        StringBuilder breakDown = new StringBuilder();
        additions.stream().forEach(e -> {
            breakDown.append(e.name());
            breakDown.append(": ");
            breakDown.append(e.getCost());
            breakDown.append("\n");}
        );
        return "Total cost: " + totalCost + "\n" + breakDown.toString();
    }

}
