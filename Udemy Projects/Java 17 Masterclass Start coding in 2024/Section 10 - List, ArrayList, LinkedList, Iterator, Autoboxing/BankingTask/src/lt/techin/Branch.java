package lt.techin;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            // customers.add(new Customer(customerName, initialAmount));
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {

        // Customer existingCustomer = findCustomer(customerName);
        // if (existingCustomer != null) {
        //     existingCustomer.addTransaction(amount);
        //     return true;
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {

        // for (int i = 0; i < customers.size(); i++) {
        //     Customer checkedCustomer = customers.get(i);
        //     if (checkedCustomer.getName().equals(customerName)) {
        //         return checkedCustomer;
        for (Customer customer : this.customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
