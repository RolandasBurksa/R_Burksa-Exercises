package section_17;

public class StringMagic {

    public int countUppercaseLetters(String str) {

        if (str == null){
            return -1;
        }
        int count = 0;

        for (int i = 0; i <str.length(); i++) {
//            System.out.println(str.charAt(i));
            if(Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
