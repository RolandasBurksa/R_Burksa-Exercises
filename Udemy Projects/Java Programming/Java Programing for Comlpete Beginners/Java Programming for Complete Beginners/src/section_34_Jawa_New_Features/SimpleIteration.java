package section_34_Jawa_New_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList("Manx", "Cymric", "Mutt", "Pug", "Cymric", "Pug", "Manx", "Cymric", "Rat", "EgyptianMau"));
        Iterator<String> it = pets.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("***   ***   ****");
        pets.forEach(System.out::println);

        System.out.println("___   ___   ___");
        for (String p : pets) {
            System.out.println(p + ", ");
        }

            System.out.println("+++   +++   +++");

        it = pets.iterator();

            for (int i = 0; i < 5; i++) {
                it.next();
                it.remove();
            }
            System.out.println(pets);
    }
}