import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long average = 0;

        while (true) {
            System.out.println("Enter a number or a char:");
            String input = scanner.nextLine();
            int number = 0;

            try {
                number = Integer.parseInt(input);
                sum += number;
                count ++;
            } catch (Exception e) {
                break;
            }
        }

        if (count > 0){
            average = Math.round((double) sum/count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);

    }
}
