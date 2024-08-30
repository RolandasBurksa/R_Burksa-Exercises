package section_26;

public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c))
                System.out.println("meaning: " + (int) c + " symbol: " + c);
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("The number is: " + i);
        }

        int k = 0;

        for (int j = 1; j <= 25; j++) {
            int result = (int) (Math.random() * 10);
            if (k < result) {
                System.out.println("Math random result: " + " < "  + result + ", j: " + j);
                k = result;
            } else if (k == result) {
                System.out.println("Math random result: " + " = " + result + ", j: " + j);
                k = result;
            } else if (k > result) {
                System.out.println("Math random result: " +" > "+ result + ", j: " + j);
                k = result;
            }
        }
    }
}
