public class SecondClass {

    public static void main(String[] args) {
        System.out.println("Hello, You!.");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not an alien..");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true...");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error..");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen...");
        }

        String makeOfCar = "Nissan";
        boolean isDomestic = makeOfCar == "Nissan" ? false : true;

        if (isDomestic) {
            System.out.println("Is domestic to my country..");
        }

        System.out.println(" --- --- --- ");
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        System.out.println(" *** --- *** ");
        double variableOne = 20.00;
        double variableTwo = 80.00;

        double result = ((variableOne + variableTwo) * 100.00) % 40.00;
        System.out.println("result = " + result);

        boolean variableBoolean = (result == 0.00) ? true : false;
        System.out.println("Step 5 - boolean variable = " + variableBoolean);

        if (variableBoolean != true) {
            System.out.println("... got some remainder...");
        }
        else {
            System.out.println("True!..");
        }
    }

}
