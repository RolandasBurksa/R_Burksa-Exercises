package chapter04;

public class XCopy {


    public static void main(String[] args) {
    int orig = 42;
    XCopy x = new XCopy();
    int y = x.go(orig);
        System.out.println("Origin: " +orig + "; " + "Value y: " + y);
    }

    int go(int arg)  {
        System.out.println("arg_01: " + arg);
//        arg = arg * 2;
        arg *= 2;
        System.out.println("arg_02: " + arg);
        return arg;
    }

}
