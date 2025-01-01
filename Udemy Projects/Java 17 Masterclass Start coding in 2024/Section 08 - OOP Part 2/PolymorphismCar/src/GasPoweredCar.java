public class GasPoweredCar extends Car {

    private double avgKmPerLitre;

    private  int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
//        super.startEngine();
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
//        super.runEngine();
        System.out.printf("Gas -> usage exceeds the average: %f %n", avgKmPerLitre);
    }
}
