package section_22;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

    public static void main(String[] args) {
        String str = "This is an awesome occasion. " + "This has never happened before.";

        Map<Character, Integer> occurrences = new HashMap<>();

        char[] characters = str.toCharArray();
        for (char character : characters) {
            // get the character
            Integer integer =  occurrences.get(character);
            if(integer == null) {
                occurrences.put(character, 1);
            } else {
                occurrences.put(character, integer + 1);
            }
            // if it is there, we increment the count
            // if it is not there, initialize to 1
        }
        System.out.println(occurrences);

        Map<String, Integer> stringoccurrences = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            // get the word
            Integer integer =  stringoccurrences.get(word);
            if(integer == null) {
                stringoccurrences.put(word, 1);
            } else {
                stringoccurrences.put(word, integer + 1);
            }
        }
        System.out.println(stringoccurrences);
    }
}
