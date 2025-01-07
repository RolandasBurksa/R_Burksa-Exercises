package lt.techin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayOrigin = {2, 3, 60, 90, 100};
        System.out.println("Origin array: " + Arrays.toString(arrayOrigin));
        System.out.println();

//        reverseArray(arrayOrigin);
//        System.out.println("Reversed array: " + Arrays.toString(arrayOrigin));

        System.out.println();
        int[] copied = reverseCopy(arrayOrigin);
        System.out.println("Copied array: " + Arrays.toString(copied));
    }

    private static void  reverseArray(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}
