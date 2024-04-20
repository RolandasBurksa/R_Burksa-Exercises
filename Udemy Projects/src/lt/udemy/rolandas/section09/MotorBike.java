package lt.udemy.rolandas.section09;

public class MotorBike {

//    int speed;

    private int speed;

//  2-O cia konstruktorius, kuris yra Default'as 1 pozicijai. Vadinasi - NoArgConstructor
    MotorBike(){
        this(10);
    }

//  1-Cia padarytas konstruktorius, kurio pavadinimas turi sutapti su klases pavadinimu
    MotorBike (int speed){
        this.speed = speed;
    }

    public void setSpeed(int speed){
        if(speed > 0)
            this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int howMuch){
        this.speed = this.speed + howMuch;
    }
    public void decreaseSpeed(int howMuch){
//        if(this.speed - howMuch > 0)
//        this.speed = this.speed - howMuch;
        setSpeed(this.speed - howMuch);
    }

    void start() {
        System.out.println("Bike started!");
    }
}
