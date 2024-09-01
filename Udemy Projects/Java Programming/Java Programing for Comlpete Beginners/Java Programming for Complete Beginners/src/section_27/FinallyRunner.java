package section_27;

import java.util.Scanner;

public class FinallyRunner {

    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            int[] numbers = {1, 2, 3, 4, 5};

            int number = numbers[5];

//            System.out.println("Before Scanner Close...");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Before Scanner Close...");
            if (scanner != null) {
                scanner.close();
            }
        }

        System.out.println("Just before closing out main...");
    }
}
