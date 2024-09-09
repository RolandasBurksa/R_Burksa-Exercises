package section_34_Jawa_New_Features;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Darius");
        names.add("Marius");
        names.add("Karius");
        List<String> copyOfNames = List.copyOf(names);

        doNotChange(copyOfNames);
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeAllowed");

    }
}
