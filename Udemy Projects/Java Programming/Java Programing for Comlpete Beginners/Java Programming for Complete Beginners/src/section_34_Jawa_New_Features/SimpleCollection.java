package section_34_Jawa_New_Features;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
//        for (int number:c) {
//            System.out.print(number + " ");
//        }
        c.stream().forEach(a -> System.out.print(a + " "));
    }
}
