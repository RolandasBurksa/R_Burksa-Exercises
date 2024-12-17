public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(){
        this("Nobody", "nobody@email.com");
        System.out.println("Empty constructor called...");
    }

    public Customer(String name, String emailAddress){
        this(name, 1000.0, emailAddress);
    }

    public Customer(String name, Double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return name;
    }

    public Double getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return emailAddress;
    }
}
