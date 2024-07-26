package section_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weekdays {

    public static void main(String[] args) {

        String[] daysValues = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sunday", "Saturday"};

        int maxLength = 0;
        for (String day : daysValues) {
            if (day.length() > maxLength) {
                maxLength = day.length();
            }
        }

        List<String> maxLengthValues = new ArrayList<>();
        for (String day : daysValues) {
            if (day.length() == maxLength) {
                maxLengthValues.add(day);
            }
        }
        System.out.println("Strings with the maximum length (" + maxLength + "): " + maxLengthValues);
        System.out.println("   ***   ***   ***   ");

        for (int i = daysValues.length -1; i >= 0; i--) {
            System.out.println(daysValues[i]);
        }
    }
}