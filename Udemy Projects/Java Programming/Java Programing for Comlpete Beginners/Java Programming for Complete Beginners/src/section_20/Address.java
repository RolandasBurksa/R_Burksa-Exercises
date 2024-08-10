package section_20;

public class Address {
    private String line1;
    private String city;
    private String zip;

    // creation
    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return String.format("line - %s , city - %s , zip - %s,", line1, city, zip);
    }
}
