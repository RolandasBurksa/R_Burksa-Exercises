public class MainThird {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));              // This is first test case
        System.out.println(getDurationString(-65, 145));    // This is the second test case
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
//        return getDurationString(minutes, seconds);   // second can be more than 59.
        return getDurationString(minutes, seconds % 60);
    };

    public  static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be gaiter then 0, and less then 59  value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int hours = minutes /60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return "Second " + hours + "h "  + remainingMinutes + "m " + remainingSeconds + "s"  ;
    }
}
