package lt.techin;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListItrDemo {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();

        data.add("Akis");
        data.add("Ausis");
        data.add("Nosis");
        data.add("Dantis");

        System.out.println(data);

        ListIterator li = data.listIterator();

        while (li.hasNext()){
            String item = (String)li.next();

            if (item.equals("Akis")) {
                li.add(" Danguje");
            } if (item.equals("Ausis")) {
                li.remove();
            } if (item.equals("Dantis")) {
                li.set("Protinis - Dantis");
            }
        }
        System.out.println(" Atsakymas: " + data);
    }

}
