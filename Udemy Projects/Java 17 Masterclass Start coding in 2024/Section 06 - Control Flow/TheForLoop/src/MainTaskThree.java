public class MainTaskThree {

    public static void main(String[] args) {

    int sum = 0;
    int count = 0;

    for (int i = 1; i <= 1000; i++) {
        if ( i % 3 == 0 && i % 5 ==0) {
            sum = sum + i;
            count++;
//            System.out.println("Count = " + count);
//            System.out.println("The sum is = " + sum);
        }
            if (count == 5) {
//                System.out.println("The final sum is = " + sum);
                break;
            }

        }
        System.out.println("The final sum is = " + sum);

    }
}
