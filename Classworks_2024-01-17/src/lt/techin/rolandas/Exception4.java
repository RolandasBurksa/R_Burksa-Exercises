package lt.techin.rolandas;

import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) {
        int number = 20;
        try {
            unsafe(number);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void unsafe(int number) throws FileNotFoundException {
        if (number > 10){
            throw new FileNotFoundException();
        }
    }
}
