package lt.udemy.rolandas.section12;

import java.util.Scanner;

public class SwitchRunnerMonth {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        System.out.println(determineNumberOfMonth(2
        ));
//        int numberOfMonth = scanner.nextInt();
    }

    public static String determineNumberOfMonth(int monthNumber){

        switch (monthNumber){
            case 1: return "Sausis";
            case 2: return "Vasaris";
            case 3: return "Kovas";
            default: return "Klaida";
        }
    }
}
