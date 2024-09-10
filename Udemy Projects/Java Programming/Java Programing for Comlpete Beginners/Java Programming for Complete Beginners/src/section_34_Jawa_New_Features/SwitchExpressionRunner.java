package section_34_Jawa_New_Features;

public class SwitchExpressionRunner {

    public static String findDayOfTheWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 0: dayOfWeek = "Sunday"; break;
            case 1: dayOfWeek = "Monday"; break;
            case 2: dayOfWeek = "Tuesday"; break;
            case 3: dayOfWeek = "Wednesday"; break;
            case 4: dayOfWeek = "Saturday"; break;
            default: throw new IllegalArgumentException("Invalid Option " + day);
        }
        return dayOfWeek;
    }

    public static String findDayOfTheWeekAnother(int day){
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Saturday";
            default -> throw new IllegalArgumentException("Invalid Option " + day);
        };
        return dayOfWeek;
    }

    public static void main(String[] args) {

    }
}
