package section_15;

public class BiNumberGcd {
    private int number1;
    private int number2;

    public BiNumberGcd() {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int calculateGCD() {
        // Write your code here
        if (number1 < 0 || number2 < 0) {
            return 1;
        }
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        if (number1 == number2) {
            return number1;
        }
        int min = Math.min(number1, number2);

        for (int i = min; i > 0; i--) {
            boolean isDivisorOfBothNumbers = number1 % i == 0 && number2 % i == 0;
            if (isDivisorOfBothNumbers) {
                return i;
            }
        }
        return -1;
    }
}