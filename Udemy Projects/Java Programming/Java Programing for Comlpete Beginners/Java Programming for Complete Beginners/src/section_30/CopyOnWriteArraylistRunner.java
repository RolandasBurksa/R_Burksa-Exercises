package section_30;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistRunner {

    public static void main(String[] args) {
    List<String> list = new CopyOnWriteArrayList<>();

    //Threads - 3
    list.add("Ant");
    list.add("Bat");
    list.add("Cat");

    //Threads - 1000
        for (String element: list) {
            System.out.println(element);
        }
    }
}

