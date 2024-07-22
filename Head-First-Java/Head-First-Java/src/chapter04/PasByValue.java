package chapter04;

public class PasByValue {
    int x;
    int y;

    void takeTwo (int x, int y){
        int z = x + y;
        System.out.println("Total is: " + z);
    }

    void go(){
        int foo = 7;
        int bar = 3;
        PasByValue t = null;
        t.takeTwo(foo, bar);
    }

}
