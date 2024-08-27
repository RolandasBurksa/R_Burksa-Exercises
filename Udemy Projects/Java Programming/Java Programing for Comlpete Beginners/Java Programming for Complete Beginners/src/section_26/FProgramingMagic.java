package section_26;

import java.util.List;
import java.util.stream.Collectors;

public class FProgramingMagic {

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {

        if (courses == null) {
            return List.of();
        }
        return courses.stream()
//                .map(element -> element.length())
                .map(String::length)
                .collect(Collectors.toList());
    }
}
