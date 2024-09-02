package section_30;

import java.util.ArrayList;
import java.util.List;

public class ForEachString {

    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray())
        System.out.print(c + " ");
        System.out.println();
        System.out.println("---- ---- ---- ---- ----");

    // Convert the string to a List of Characters
    String str = "An African Swallow";
    List<Character> charList = new ArrayList<>();

        for (char c : str.toCharArray()){
        charList.add(c);
    }
        // Iterate over the List and print each character
        for (char c : charList) {
            System.out.print(c + " ");
        }
    }
}
