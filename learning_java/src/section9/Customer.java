package section9;

import java.util.ArrayList;

/**
 * Created by dbrown on 1/25/17.
 */
public class Customer {
    private String name;
    private Double balance;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    Customer(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    Customer(String name, Double balance, ArrayList<Double> transactions) {
        this.name = name;
        this.balance = balance;
        this.transactions = transactions;
    }

    public void addTransaction(Double amount) {
        transactions.add(amount);
        balance += amount;
    }

    @Override
    public String toString() {
        return "section9.Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public Double getBalance() {
        return balance;
    }
}
