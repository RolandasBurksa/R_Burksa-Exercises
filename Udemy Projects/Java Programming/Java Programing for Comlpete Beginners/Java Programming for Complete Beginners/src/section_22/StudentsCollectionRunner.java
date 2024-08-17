package section_22;

import java.util.*;


class DescendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class StudentsCollectionRunner {

    public static void main(String[] args) {

        List<Student> students = List.of(new Student(1, "Algis"),
                new Student(100, "Dalgis"),
                new Student(10, "Malgis"));

        ArrayList<Student> studentsAl = new ArrayList<>(students);
        System.out.println("Reg " + studentsAl);

        Collections.sort(studentsAl);
        System.out.println("Asc " + studentsAl);

        Collections.sort(studentsAl, new DescendingStudentComparator());
        System.out.println("Dsc " + studentsAl);

        studentsAl.sort(new DescendingStudentComparator());
        System.out.println("DescendingStudentComparator " + studentsAl);
    }
}
