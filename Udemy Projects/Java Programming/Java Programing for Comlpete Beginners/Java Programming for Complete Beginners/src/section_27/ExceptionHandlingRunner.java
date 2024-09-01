package section_27;

public class ExceptionHandlingRunner {

    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 ended");
    }

    private static void method2() {
        String str = null;
        str.length();
        System.out.println("Method2 ended");
    }
}
