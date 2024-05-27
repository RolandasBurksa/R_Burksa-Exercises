package lt.udemy.rolandas.section12;

public class SwitchRunnerWeekDay {

    public static void main(String[] args) {
        System.out.println(isWeekDay(8));
    }

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber){
            case 1: return false;
            case 3: return false;
            case 6: return true;
            default: return false;

        }
    };
}
