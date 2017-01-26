import java.util.ArrayList;

/**
 * Created by dbrown on 1/25/17.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public void addCustomer(String name, Double initialAmount) {
        Customer customer = new Customer(name, initialAmount);
        customers.add(customer);
    }

    public void addCustomerTransaction(String name, Double amount) {
        Customer customer = getCustomerByName(name);
        customer.addTransaction(amount);
    }

    public Double getBalanceForCustomer(String name) {
        Customer customer = getCustomerByName(name);
        return customer.getBalance();
    }

    private Customer getCustomerByName(String name) {
        // Could be more than 1 jerry?
        return customers.stream().filter(e -> e.getName().equals(name)).findFirst().get();
//        Optional<Customer> customer = customers.stream().filter(e -> e.getName().equals(name)).findFirst();
//        if (customer.isPresent()) {
//            return customer.get();
//        } else {
//            throw new Exception("Customer: " + name + " does not exist");
//        }
    }

}
