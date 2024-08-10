package section_20;

public class Customer {

    // state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    // creating
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    // operations
    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String toString() {
        return name + " " + homeAddress + " " + workAddress + " ";
    }
}

