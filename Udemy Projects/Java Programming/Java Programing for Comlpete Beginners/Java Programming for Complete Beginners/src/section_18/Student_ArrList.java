package section_18;

import java.util.ArrayList;

public class Student_ArrList {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student_ArrList(String name, int... marks) {
        this.name = name;

        for (int mark : marks) {
            this.marks.add(mark);
        }
    }
}
