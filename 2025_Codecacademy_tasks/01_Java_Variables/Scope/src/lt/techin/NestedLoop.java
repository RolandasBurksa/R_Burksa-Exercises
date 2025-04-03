package lt.techin;

public class NestedLoop {

    public static void main(String[] args) {
        int tableSize = 10;
        for(int i = 1; i <= 10; i++){
            for(int j = 10; j >= 1; j--){
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
