package section_15;

public class FactorialCalculator {

    public int calculatorFactorial(int number){

        if ( number < 0) {
            return -1;
        }
        int factorial = 1;
        for ( int i = 2; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
}
