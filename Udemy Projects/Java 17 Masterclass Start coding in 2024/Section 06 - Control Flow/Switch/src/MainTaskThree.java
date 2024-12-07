public class MainTaskThree {

    public static void main(String[] args) {

        printNumberInWord(1);
        printNumberInWord(5);
        printNumberInWord(10);
        printNumberInWord(-5);
    }

        public static void printNumberInWord(int number) {

            String numberInWord = switch (number) {
                case 1 -> { yield "ONE"; }
                case 2 -> "TWO";
                case 3 -> "THREE";
                case 4 -> "FOUR";
                case 5 -> "FIVE";
                case 6 -> "SIX";
                case 7 -> "SEVEN";
                case 8 -> "EIGHT";
                case 9 -> "NINE";
                default -> "OTHER";
            };

            System.out.println(number +  " is " + numberInWord);
        }

    public static void printNumberInWordB(int number) {

        String numberInWord;
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);
    }
}
