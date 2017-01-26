/**
 * Created by dbrown on 1/25/17.
 */
public class Challenge3 {
    public static void main(String[] args) {
        Bank bank = new Bank("Deeje Bank");
        bank.addBranch("branch1");

        Branch branch1 = bank.getBranch("branch1");
        branch1.addCustomer("Dustin", 0d);
        branch1.addCustomerTransaction("Dustin", 100.93);

        System.out.println(branch1);
        branch1.addCustomerTransaction("Dustin", -1100.93);
        System.out.println(branch1);

        String branch2 = "branch2";
        

    }
}
