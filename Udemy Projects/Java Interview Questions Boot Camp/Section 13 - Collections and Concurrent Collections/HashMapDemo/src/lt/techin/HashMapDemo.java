package lt.techin;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

//        HashMap m = new HashMap();
//        Map m2 = new HashMap();
//
//        HashMap m3 = new HashMap(20);
//        HashMap m4 = new HashMap(20, .09f);
//
//        HashMap m5 = new HashMap(m2);

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Math", 80);
        marks.put("English", 90);
        System.out.println(marks);

        System.out.println("-".repeat(30));
        marks.put("Math", 11);
        System.out.println(marks);

        System.out.println("-".repeat(30));
        Set s = marks.keySet();
        System.out.println(s);

        Collection v = marks.values();
        System.out.println(v);

        Set st = marks.entrySet();
        System.out.println(st);

        Iterator itr = st.iterator();
        while (itr.hasNext()) {

            Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>) itr.next();
            System.out.println(m1.getKey() + " ---> " + m1.getValue());
            if (m1.getKey().equals("Math")) {
                m1.setValue(999);
            }
        }
        System.out.println(marks);

        System.out.println("-".repeat(30));
        Iterator<Map.Entry<String, Integer>> itr1 = marks.entrySet().iterator();
        while (itr1.hasNext()) {

            Map.Entry<String, Integer> m1 = itr1.next();
            System.out.println(m1.getKey() + "---" + m1.getValue());
            if (m1.getKey().equals("Math")) {
                m1.setValue(999); // This is allowed
            }
        }

        System.out.println(marks);
    }
}
