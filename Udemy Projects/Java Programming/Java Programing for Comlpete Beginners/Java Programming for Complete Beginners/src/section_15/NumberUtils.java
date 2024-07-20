package section_15;

public class NumberUtils {

    public int getLastDigit( int number) {

        if ( number < 0 ) {
            return -1;
        } else if (number == 0) {
            return 0;
        }
        return number % 10;
    }
}