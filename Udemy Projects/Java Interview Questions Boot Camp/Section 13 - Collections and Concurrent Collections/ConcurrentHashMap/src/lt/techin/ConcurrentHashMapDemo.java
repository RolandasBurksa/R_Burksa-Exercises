package lt.techin;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(0, "Basics");
        map.put(1, "Strong");
        map.put(0, "Nose");
        System.out.println(map);
        map.remove(0);

        map.putIfAbsent(0, "Nothing");
        System.out.println(map);

        map.putIfAbsent(2, "Nothing");
        System.out.println(map);

        map.remove(1, "Strong");
        System.out.println(map);

        map.replace(0, "Nothing", "Something");
        System.out.println(map);

        map.replace(0, "Anything");
        System.out.println(map);
        System.out.println("- - - - -  -");
        System.out.println(map.replace(0, "Anything"));

    }
}
