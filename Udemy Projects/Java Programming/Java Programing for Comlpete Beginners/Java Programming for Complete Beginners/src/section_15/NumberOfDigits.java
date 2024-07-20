package section_15;

public class NumberOfDigits {

    public int numberOfDigits(int number) {

        if ( number < 0) {
            return -1;
        }
        if (number == 0){
            return 1;
        }

        int numberOfDigits = 1;

        while ( number >= 10 ){
            number /= 10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }
}
