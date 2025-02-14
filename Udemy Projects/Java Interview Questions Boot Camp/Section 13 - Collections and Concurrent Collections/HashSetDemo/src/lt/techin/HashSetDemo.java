package lt.techin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet(30);
        HashSet hs3 = new HashSet(100, .80f);

        ArrayList l = new ArrayList();
        HashSet hs4 = new HashSet((l) );

    }
}
