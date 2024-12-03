public class MainSecond {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));              // This is first test case
        System.out.println(getDurationString(65, 45));    // This is the second test case

    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;

        return getDurationString(minutes, seconds)  ;
    };

    public  static String getDurationString(int minutes, int seconds) {

        int hours = minutes /60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return "Second " + hours + "h "  + remainingMinutes + "m " + remainingSeconds + "s"  ;
    }
}
