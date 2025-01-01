public class Main {

    public static void main(String[] args) {

        Car car = new Car("Blue Car");
        runRace(car);

        System.out.println("- - - - - - - - ");

        Car ferrari = new GasPoweredCar("Gas Car ferrari", 15.4,6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
