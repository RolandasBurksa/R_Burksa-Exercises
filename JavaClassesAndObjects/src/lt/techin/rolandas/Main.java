package lt.techin.rolandas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();  // Create new Car object
        myCar.model = "BMW";
        myCar.productionYear = 1992;
        myCar.color = "Black";
        System.out.println(myCar.model);
        System.out.println(myCar.productionYear);
        System.out.println(myCar.price);

        Car realCar = new Car("Toyota", 2016, 10000);
        System.out.println(realCar.productionYear);

        Car otherCar = new Car("Kia", 15000);
        Car myColorCar = new Car("Blue", "Volvo", 2023, 54000, true);

        Car[] myCars = {realCar, otherCar, myColorCar};  // My garage
        for (Car element : myCars) {
            System.out.println(element.model + " : " + element.productionYear);
        }

        if (myColorCar.buyCar()) {
            System.out.println("Pirksiu");
        } else {
            System.out.println("Nepirksiu");
        }
    }
}
