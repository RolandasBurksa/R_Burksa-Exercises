package chapter01;

public class Test {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        while (x < 5) {

//            y = x - y;   // 1 condition

//            y = x + y;   // 2 condition

//            y = y + 2;    // 3 condition
//            if ( y > 4 ) {
//                y = y -1;
//            }

//            x = x + 1;    // 4 condition
//            y = y + x;

            if ( y < 5) {   // 5 condition
                x = x + 1;
                if ( y < 3) {
                    x = x -1;
                }
            }
            y = y +2;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
