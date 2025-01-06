package lt.techin;

import java.util.Arrays;
import java.util.Scanner;

public class MainSecond {

    public static void main(String[] args) {
        // Get user input of Array length
        int[] array = SortedArray.getIntegers(5);
        printArray(array);
        System.out.println();
        printArray(sortIntegers(array));
    }

    public static class SortedArray {

        public static int[] getIntegers(int size) {

            Scanner scanner = new Scanner(System.in);
            int[] array = new int[size];

            System.out.println("Enter " + size + " integer values:\r");

            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter value " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
            scanner.close();
            return array;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

//        int[] sortedArray = Arrays.copyOf(array, array.length);
        int[] sortedArray = array.clone();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}
