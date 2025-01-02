public class Main {

    public static void main(String[] args) {

        Car car = new Car("Blue Car");
        runRace(car);

        System.out.println("- - - - - - - - ");

        Car ferrari = new GasPoweredCar("Gas Car ferrari", 15.4,6);
        runRace(ferrari);

        System.out.println("- - - - - - - - ");

        Car tesla = new ElectricCar("2022 Red Tesla", 568, 75);
        runRace(tesla);

        System.out.println("- - - - - - - - ");

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
