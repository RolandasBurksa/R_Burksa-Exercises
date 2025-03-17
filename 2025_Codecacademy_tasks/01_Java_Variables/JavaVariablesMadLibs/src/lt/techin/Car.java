package lt.techin;

public class Car {

    public String color = "red";
    public boolean isElectric = false;
    public int cupHolders = 4;

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.color + " " + myCar.isElectric + " " + myCar.cupHolders); // Prints: red
        myCar.color = "green";
        System.out.println(myCar.color);
    }
}
