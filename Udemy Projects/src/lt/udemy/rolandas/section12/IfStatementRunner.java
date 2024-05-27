package lt.udemy.rolandas.section12;

public class IfStatementRunner {

    public static void main(String[] args) {
        int i = 84;
        // i is 25
        // i is 24
        // i is neither 25 or 24
        if( i == 25) {
            System.out.println("i = 25");
        } else if( i == 24){
            System.out.printf("i = 24");
    }
        else {
            System.out.printf("i != 24 and i != 25");
        }
    }
}
