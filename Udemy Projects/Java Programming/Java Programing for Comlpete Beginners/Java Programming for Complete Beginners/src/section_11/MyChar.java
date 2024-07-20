package section_11;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        // 'a' e i o u or A E I O U
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o')

//            if( ch == 'a' || ch == 'A')
//            if ( Character.toUpperCase('a') == 'A')
            return true;
        return false;
    }

    public boolean isDigit() {
        // ch >= 48 && ch <= 57  => between '0' and '9'
        if (ch >= 48 && ch <= 57)
            return true;
        return false;
    }

    public boolean isAlphabet() {
        // ch >= 97 && ch <= 122  => between 'a' and 'z'
        if (ch >= 97 && ch <= 122)
            return true;

        if (ch >= 65 && ch <= 90)    // between 'A' and 'Z'
            return true;

        return false;
    }

    public boolean isConsonant() {
        // Alphabet and is not VOWEL
        // 'a' e i o u or A E I O U
        if (isAlphabet() && !isVowel())
            return true;

        return false;
    }

    public static void printLowerCaseAlphabets() {
        // 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets() {
        // 'A' to 'Z'
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}
