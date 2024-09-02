package section_31_Java_Tips;

public class ExampleClass {
    public void publicMethod() {}
    protected void protectedMethod() {}
    private void privateMethod() {}
    void defaultMethod() {}

    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();
        exampleClass.privateMethod();
        exampleClass.defaultMethod();
    }


}
