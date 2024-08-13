package section_20;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return getClass().getName() + "#" + Integer.toHexString(hashCode());
    }
}
