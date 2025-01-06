package lt.techin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] inputIntegers = readIntegers(5);
        System.out.println("Input Array: " + Arrays.toString(inputIntegers));
        System.out.println();

        System.out.println("Array Min value = " + findMin(inputIntegers));

    }

    public static int[] readIntegers(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < array.length; i ++) {
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int findMin(int[] array) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

//        for (int element : array) {
//            if (element < minValue) {
//                minValue = element;
//            }
//        }
        return minValue;
    }

}
