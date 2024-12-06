public class MainTaskOne {

    public static void main(String[] args) {

        char switchValue = 'C';

//        switch (switchValue) {
//            case 'A':
//                System.out.println("The letter " + switchValue + " means Able");
//                break;
//            case 'B':
//                System.out.println("The letter " + switchValue + " means Baker");
//                break;
//            case 'C':
//                System.out.println("The letter " + switchValue + " means Charlie");
//                break;
//            case 'D':
//                System.out.println("The letter " + switchValue + " means Dog");
//                break;
//            case 'E':
//                System.out.println("The letter " + switchValue + " means Easy");
//                break;
//            default:
//                System.out.println("The letter " + switchValue + " not found");
//                break;
//        }

        switch (switchValue) {
            case 'A' -> System.out.println("The letter " + switchValue + " means Able");
            case 'B' -> System.out.println("The letter " + switchValue + " means Baker");
            case 'C' -> System.out.println("The letter " + switchValue + " means Charlie");
            case 'D' -> System.out.println("The letter " + switchValue + " means Dog");
            case 'E' -> System.out.println("The letter " + switchValue + " means Easy");
            default  -> System.out.println("The letter " + switchValue + " not found");
        }
    }
}
