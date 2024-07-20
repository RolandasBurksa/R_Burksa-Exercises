package section_15;

public class ReversedNumber {

    public int reversedNumber( int number){
        if ( number < 0) {
            return  -1;
        }
        if (number == 0) {
            return 0;
        }
        int reversed = 0;
        while (number != 0){
             int lastDigit = number % 10;
             reversed = reversed *10 + lastDigit;
             number /=10;
        }
        return reversed;
    }
}
