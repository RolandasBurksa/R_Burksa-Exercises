package section_31_Java_Tips;

class Default {

}

public class NestedClassRunner {
    int i;

    class InnerClassA {
        public void method() {
            i = 5;
        }

    }

    static class StaticNestedClass {

    }

    public static void main(String[] args) {
//        InnerClassA innerClass = new InnerClassA();
        StaticNestedClass staticNestedClass = new StaticNestedClass();

        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClassA innerClass = nestedClassRunner.new InnerClassA();

    }
}
