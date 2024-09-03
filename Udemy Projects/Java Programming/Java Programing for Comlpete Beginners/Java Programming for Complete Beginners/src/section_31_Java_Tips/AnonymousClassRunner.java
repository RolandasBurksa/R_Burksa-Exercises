package section_31_Java_Tips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{

    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str1.length(), str2.length());
    }
}

public class AnonymousClassRunner {

    public static void main(String[] args) {
       List<String> animals = new ArrayList<String>(
               List.of("Ant", "Cat", "Ball", "Bull", "Elephant"));
        Collections.sort(animals);
        System.out.println(animals);
    }
}
