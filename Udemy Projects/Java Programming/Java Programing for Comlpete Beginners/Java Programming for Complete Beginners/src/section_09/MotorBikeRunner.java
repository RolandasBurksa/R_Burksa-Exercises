package section_09;

public class MotorBikeRunner {
    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(0);
        MotorBike honda = new MotorBike(0);
        MotorBike bmw = new MotorBike(); // <- nera klaidos, nes yra konstroktorius 1, kitaip reikia argumento

        ducati.start();
        honda.start();

        ducati.setSpeed(100);

//        int ducatiSpeed = ducati.getSpeed();
//        ducatiSpeed += 150;
//        ducati.setSpeed(ducatiSpeed);

        ducati.increaseSpeed(180);
        System.out.println("Ducati speed : " + ducati.getSpeed());

        honda.setSpeed(80);
        System.out.println("Honda speed : " + honda.getSpeed());


    }
}
