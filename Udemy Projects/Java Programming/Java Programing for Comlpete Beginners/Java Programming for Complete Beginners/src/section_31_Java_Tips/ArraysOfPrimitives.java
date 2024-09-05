package section_31_Java_Tips;

import java.util.Arrays;

public class ArraysOfPrimitives {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};
        int[] a2;
        a2 = a1;

        for (int i = 0; i < a2.length; i++){
            a2[i] = a2[i] + 1;
        }

        for (int i = 0; i < a1.length; i++){
            System.out.println("a1[" + i + "] = " + a1[i]);
        }

        int[] a = {1, 2, 3};

        int[] b = {1, 2, 3};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
