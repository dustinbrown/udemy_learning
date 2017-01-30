package section9;

import java.util.ArrayList;

/**
 * Created by dbrown on 1/25/17.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    public Branch getBranch(String name){
        return branches.stream().filter(e -> e.getName().equals(name)).findFirst().get();
    }
    public void addBranch(String name) {
        branches.add(new Branch(name));

    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }


}
