public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> engine starts...");
    }

    public void drive(){
        System.out.println("Car -> drives like: " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> Engine is running");
    }
}
