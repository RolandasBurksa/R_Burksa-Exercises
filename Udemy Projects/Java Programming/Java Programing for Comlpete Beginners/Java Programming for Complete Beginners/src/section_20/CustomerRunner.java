package section_20;

public class CustomerRunner {

    public static void main(String[] args) {

        Address homeAddress = new Address("line1", "Miestas", "010203");
        Customer customer = new Customer("Vardenis", homeAddress);
        System.out.println(customer);

        Address workAddress = new Address("line2", "Miestas2","020304");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
