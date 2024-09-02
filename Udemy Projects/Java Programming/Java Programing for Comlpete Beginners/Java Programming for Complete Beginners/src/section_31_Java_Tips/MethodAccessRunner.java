package section_31_Java_Tips;

public class MethodAccessRunner {

    public static void main(String[] args) {

        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();
//        exampleClass.privateMethod();
        exampleClass.defaultMethod();
    }
}
