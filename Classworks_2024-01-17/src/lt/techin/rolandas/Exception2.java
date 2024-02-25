package lt.techin.rolandas;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 10){
                try {
                    throw  new IOException("");
                } catch (IOException e) {
                    System.out.println("Number not correct ...");;
                }
            }
        }

    }
}
