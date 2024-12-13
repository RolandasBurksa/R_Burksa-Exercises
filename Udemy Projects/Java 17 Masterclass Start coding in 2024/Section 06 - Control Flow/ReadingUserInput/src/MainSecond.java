public class MainSecond {

    public static void main(String[] args) {

        fizzBuzz(15);
    }
        public static void fizzBuzz(int n) {


            if ((0 >= n) || (n >= 2 * 100000)) {
                System.out.println("NONE");
                return;
            }
            int i = 1;

            while (i <= n) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
//                    if (i % 5 != 0) {
                        System.out.println("Fizz");
//                    }
                } else if (i % 5 == 0) {
//                    if (i % 3 != 0) {
                        System.out.println("Buzz");
//                    }
                } else {
                    System.out.println(i);
                }
                i++;
            }

        }

}