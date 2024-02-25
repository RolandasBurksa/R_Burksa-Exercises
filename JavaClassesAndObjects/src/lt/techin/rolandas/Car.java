package lt.techin.rolandas;

public class Car {
    // Stata
    String color;
    String model;
    int productionYear;
    double price;
    boolean canDrive;

    public Car(String color, String model, int productionYear, double price, boolean canDrive) {
        this.color = color;
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
        this.canDrive = canDrive;
    }

    // Default constructor
    public  Car(){}


// Constructor
    public Car(String model, int productionYear, double price) {
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
    }

    public Car(String model, double price) {
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
    }

// Behaviour
    boolean buyCar() {
        if (canDrive) {
            System.out.println("We can buy this car");
            return true;
        }
        return false;
    }

}
