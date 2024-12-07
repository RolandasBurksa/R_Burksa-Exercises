public class Main {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++ ) {
            System.out.println(counter);
        }

        System.out.println("100 at 5% interest = " +calculateInterest(100, 5));
        System.out.println("***   ***   ***");

        for (double rate = 2.0; rate <= 5; rate++) {
            double interestAmount = calculateInterest(100, rate);
            System.out.println("100 at " + rate + " interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));
    }
}
