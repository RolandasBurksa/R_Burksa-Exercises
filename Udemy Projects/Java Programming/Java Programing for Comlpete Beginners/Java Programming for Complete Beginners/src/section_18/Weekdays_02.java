package section_18;

public class Weekdays_02 {

    public static void main(String[] args) {

        String[] daysValues = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sunday", "Saturday"};

        String dayWithMaxLength = " ";

        for (String day : daysValues) {
            if (day.length() > dayWithMaxLength.length()) {
                dayWithMaxLength =day;
            }
        }
        System.out.println("Day with max length: " + dayWithMaxLength);

        for (int i = daysValues.length - 1; i >= 0; i--) {
            System.out.println("Day: " + daysValues[i]);
        }
    }
}
