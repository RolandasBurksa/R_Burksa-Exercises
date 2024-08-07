package section_18;

public class StringMagic {

    public String findLongestWord(String sentence) {

        if ( sentence == null || sentence.equals("")) {
            return "";
        }

        String[] words = sentence.split(" ");

        int maxLength = 0;
        String longestWorld = "";

        for ( String word : words) {
            if( word.length() > maxLength ) {
                maxLength = word.length();
                longestWorld = word;
            }
        }
        return longestWorld;
    }
}
