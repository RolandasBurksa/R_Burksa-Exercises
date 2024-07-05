package section_12;

public class SwitchExercisesRunner {

    public static void main(String[] args) {
        System.out.println("The number of day: " + determineNameOfDay(4));
        System.out.println(determineNameOfMonth(2));
        System.out.println(isWeekday(6));
    }

    public static String determineNameOfDay(int dayNumber){
        String result = " ";
        switch (dayNumber) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
        }
        return result;
    }

    public static String determineNameOfMonth(int monthNumber){
        switch (monthNumber){
            case 1 : return "January";
            case 2 : return "February";
            case 3 : return "March";
        }
        return "The number is invalid!.";
    }

    public static boolean isWeekday(int dayNumber){
        switch (dayNumber){
            case 1 :
            case 2 : return true;
            case 6 :
            case 7 : return false;
        }
        return false;
    }
}
