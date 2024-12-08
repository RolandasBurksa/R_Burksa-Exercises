public class MainSecond {

    public static void main(String[] args) {

        System.out.println("1------");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("2------");

        int number = 0;
        while (number < 50) {
           number +=5;
           if (number % 25 ==0) {
               continue;
           }
            System.out.print(number + "_");
        }
    }
}
