public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        // More code here

        switch (switchValue) {
            case 1 -> System.out.println("New_Value was 1");
            case 2 -> System.out.println("New_Value was 2");
            case 3, 4, 5 -> System.out.println("New way of solving switch case");
            default -> System.out.println("New_Value was not 1 or 2");
        }

        String month = "APRIL";
        System.out.println(month + " is in the " + gerQuarter(month) + " quarter");

    }

    public static String gerQuarter(String month){

//        switch (month) {
//            case "JANUARY":
//            case "FEBRUARY":
//            case "MARCH":
//                return "1st";
//            case "APRIL":
//            case "MAE":
//            case "JUNE":
//                return "2nd";
//            case "JULY":
//            case "AUGUST":
//            case "SEPTEMBER":
//                return "3rd";
//            case "OCTOBER":
//            case "NOVEMBER":
//            case "DECEMBER":
//                return "4th";
//        }
//        return "bad!.";

//        return switch (month) {
//            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
//            case "APRIL", "MAE", "JUNE" -> "2nd";
//            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
//            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
//            default -> "bad!.";
//        };

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAE", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad!.";
                yield badResponse;
            }
        };
    }
}
