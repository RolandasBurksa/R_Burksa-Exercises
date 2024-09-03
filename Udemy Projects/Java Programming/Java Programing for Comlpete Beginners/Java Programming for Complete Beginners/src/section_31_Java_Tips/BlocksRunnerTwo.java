package section_31_Java_Tips;

public class BlocksRunnerTwo {

    public static void main(String[] args) {
        System.out.println(0x80000000);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(60 * 60 * 24);

        System.out.println("main");

        {
            int i;
            System.out.println("3>2");
            System.out.println("3>2");
        }
    }
}
