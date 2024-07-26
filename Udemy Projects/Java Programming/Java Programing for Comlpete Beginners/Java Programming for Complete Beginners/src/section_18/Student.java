package section_18;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.OptionalInt;

public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;

    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        return Arrays.stream(marks).sum();
    }

    public OptionalInt getMaximumMark() {
        return Arrays.stream(marks).max();
    }

    public int getMinimumMark() {
//        int minimum = 100;
        int minimum = Integer.MAX_VALUE;
        for (int mark: marks) {
            if ( mark < minimum) {
                minimum = mark;
            }
        }
        return  minimum;
    }

    public BigDecimal getAverage() {

        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

//         return new BigDecimal(sum/number);
         return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }
}
