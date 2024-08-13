package section_20;

public class PersonWithConstructor {
    private String name;
    private String email;
    private String phoneNumber;

    public PersonWithConstructor() {
        System.out.println("Person Constructor Blanc");
    }

    public PersonWithConstructor(String name) {
        System.out.println("Person Constructor with name");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
