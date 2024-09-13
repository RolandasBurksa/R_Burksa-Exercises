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
    }
}
