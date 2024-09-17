package section_34_Jawa_New_Features;

import java.util.Scanner;

public class WaterBoiler {

    public static void main(String[] args) {
        int input = 105;
        if (input >= 100){
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }

        System.out.print("Input the temperature: ");
        Scanner scanner = new Scanner(System.in);
        int input01 = scanner.nextInt();
        if(input01 >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }

        System.out.print("Input the color / red / green / black: ");
        Scanner scanner01 = new Scanner(System.in);
        String color = scanner01.next();
        switch (color) {
            case "red":
                System.out.println("1");
                break;
            case "green":
                System.out.println("2");
                break;
            case "black":
                System.out.println("3");
        }

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//        int number = 1;
//        while (number <= n){
//            sum  += n;
//            n -- ;
//        }
//        System.out.println(sum);

        long fact = 1;
//        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        for (long i = n; i > 0; i-- ) {
            fact *=i;
        }
        System.out.println(fact);

        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int integer = sc.nextInt();
        if (integer >= 0 && integer <= 4 ) {
            switch (integer) {
                case 0:
                    System.out.println("Tea");
                    break;
                case 1:
                    System.out.println("Espresso");
                    break;
                case 2:
                    System.out.println("Americano");
                    break;
                case 3:
                    System.out.println("Water");
                    break;
                case 4:
                    System.out.println("Hot Chocolate");
            }
        } else {
            System.out.println("Invalid");
        }


    }
}
