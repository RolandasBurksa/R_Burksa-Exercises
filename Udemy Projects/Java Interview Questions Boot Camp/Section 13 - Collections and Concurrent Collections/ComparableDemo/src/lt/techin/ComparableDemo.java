package lt.techin;

import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[] args) {

        TreeSet data = new TreeSet(new ComparatorDemo());
        data.add(152);
        data.add(222);
        data.add(35);
        data.add(321);
        data.add(3);
        data.add(567);
        data.add(78);
        data.add(222);

        System.out.println("Tree set - " + data);

    }
}
