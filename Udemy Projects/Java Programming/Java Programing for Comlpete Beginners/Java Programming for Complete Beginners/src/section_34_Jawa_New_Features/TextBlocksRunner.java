package section_34_Jawa_New_Features;

public class TextBlocksRunner {

    public static void main(String[] args) {
        String str = """
                Line 1
                Line 2
                Line 3
                """;
        System.out.println(str);

        String textBlock = """
                Line 1: %s
                Line 2: %s
                Line 3
                
                """.formatted("Some value", "Some other value");
        System.out.println(textBlock);
    }
}
