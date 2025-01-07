package lt.techin;

import java.util.Arrays;
import java.util.Scanner;

public class MainThird {

    public static void main(String[] args) {

//        int minValue = findMin(readElements(readInteger()));
        System.out.println("Min Array value = " + findMin(readElements(readInteger())));

    }

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Arrays size = " + size);

        return size;
    }

    private static int[] readElements(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Input Array: " + Arrays.toString(array));
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for ( int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
