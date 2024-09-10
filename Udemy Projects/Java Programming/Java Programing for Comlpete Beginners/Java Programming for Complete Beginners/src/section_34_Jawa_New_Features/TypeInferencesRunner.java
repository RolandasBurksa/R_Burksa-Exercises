package section_34_Jawa_New_Features;

import java.util.List;

public class TypeInferencesRunner {

    public static void main(String[] args) {
        List<String> names1 = List.of("Andrius", "Antanas");
        List<String> names2 = List.of("Bagdonas", "Benjaminas");

//        List<List<String>> names = List.of(names1,names2);

        var names = List.of(names1,names2);

        names.stream().forEach(System.out::println);

        for (String name:names1){     // ir cia galima naudoti 'var' kaip tipa
            System.out.println(name);
        }
    }
}
