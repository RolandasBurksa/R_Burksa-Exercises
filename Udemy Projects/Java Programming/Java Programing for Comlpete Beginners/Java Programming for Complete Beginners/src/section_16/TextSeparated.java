package section_16;

public class TextSeparated {

    public static void main(String[] args) {

        String string = "There is a lot of text";

        // Vienas is budu:
//        int i = 0;
//        while (i < string.length()){
//            System.out.println(string.charAt(i));
//            i += 1;
//        }

        // Kitas budas:
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}
