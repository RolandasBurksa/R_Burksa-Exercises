package section_18;

import java.math.BigDecimal;
import java.util.OptionalInt;

public class StudentRunner {

    public static void main(String[] args) {
        int[] marks = {99, 98, 100};
        Student student = new Student("Andrius", marks);

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("The sum of marks: " + sum);

        OptionalInt maximumMark = student.getMaximumMark();
        System.out.println("The maximum of marks: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("The minimum of the marks: " + minimumMark);

        BigDecimal average = student.getAverage();
        System.out.println("The average of marks: " + average);

    }
}
