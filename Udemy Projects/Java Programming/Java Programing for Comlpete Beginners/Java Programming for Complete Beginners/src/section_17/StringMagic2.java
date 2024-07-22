package section_17;

public class StringMagic2 {

    public boolean hasConsecutiveDuplicates(String str) {

        if (str.isEmpty()) {
            return false;
        }
        for(int i = 0; i < str.length()-1; i++){
            char currentCharacter = str.charAt(i);
            char nextCharacter = str.charAt(i+1);

            if(currentCharacter == nextCharacter){
                return true;
            }

        }
        return false;
    }

}
