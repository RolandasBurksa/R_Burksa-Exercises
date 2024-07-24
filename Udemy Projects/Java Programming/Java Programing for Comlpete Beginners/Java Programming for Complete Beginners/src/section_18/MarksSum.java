package section_18;

import java.util.Arrays;

public class MarksSum {

    public static void main(String[] args) {

        int[] marks = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("The sum of array elements is: " + Arrays.stream(marks).sum() + ".");

        System.out.println(Arrays.toString(marks));

        System.out.print("The elements are: ");

            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + ", ");
            }
    }
}
