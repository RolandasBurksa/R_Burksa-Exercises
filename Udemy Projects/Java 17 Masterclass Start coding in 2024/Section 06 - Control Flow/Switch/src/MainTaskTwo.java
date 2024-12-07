public class MainTaskTwo {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(9);

        dayOfTheWeek(0);
        dayOfTheWeek(9);

        System.out.println("______________________");

        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 0:
                System.out.println(dayOfWeek + " means - Sunday");
                break;
            case 1:
                System.out.println(dayOfWeek + " means - Monday");
                break;
            case 2:
                System.out.println(dayOfWeek + " means - Tuesday");
                break;
            case 3:
                System.out.println(dayOfWeek + " means - Wednesday");
                break;
            case 4:
                System.out.println(dayOfWeek + " means - Thursday");
                break;
            case 5:
                System.out.println(dayOfWeek + " means - Friday");
                break;
            case 6:
                System.out.println(dayOfWeek + " means - Saturday");
                break;
            default:
                System.out.println(dayOfWeek + " - doesn't fit any day of the week...");
                break;
        }

        System.out.println("************************");

        switch (dayOfWeek) {
            case 0 -> System.out.println(dayOfWeek + " means - Sunday");
            case 1 -> System.out.println(dayOfWeek + " means - Monday");
            case 2 -> System.out.println(dayOfWeek + " means - Tuesday");
            case 3 -> System.out.println(dayOfWeek + " means - Wednesday");
            case 4 -> System.out.println(dayOfWeek + " means - Thursday");
            case 5 -> System.out.println(dayOfWeek + " means - Friday");
            case 6 -> System.out.println(dayOfWeek + " means - Saturday");
            default ->System.out.println(dayOfWeek + " - doesn't fit any day of the week...");
        }

        System.out.println("*************************");

        if (dayOfWeek == 0) {
            System.out.println(dayOfWeek + " means - Sunday");
        } else if (dayOfWeek == 1) {
            System.out.println(dayOfWeek + " means - Monday");
        } else if (dayOfWeek == 2) {
            System.out.println(dayOfWeek + " means - Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println(dayOfWeek + " means - Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println(dayOfWeek + " means - Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println(dayOfWeek + " means - Friday");
        } else if (dayOfWeek == 6) {
            System.out.println(dayOfWeek + " means - Saturday");
        } else {
            System.out.println(dayOfWeek + " - doesn't fit any day of the week...");
        }
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day...";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void dayOfTheWeek(int day) {

        String dayOfWeekB = "Invalid day";
        if (day == 0) {
            dayOfWeekB = "Sunday";
        } else if (day == 1) {
            dayOfWeekB = "Monday";
        } else if (day == 2) {
            dayOfWeekB = "Tuesday";
        } else if (day == 3) {
            dayOfWeekB = "Wednesday";
        } else if (day == 4) {
            dayOfWeekB = "Thursday";
        } else if (day == 5) {
            dayOfWeekB = "Friday";
        } else if (day == 6) {
            dayOfWeekB = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfWeekB);
    }
}
