public class Main {

    public static void main(String[] args) {

        for (int i =1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Harry";
                        case 4 -> "Lisa";
                        case 5 -> "Tim";
                        default -> "Anonymous";
                    },
                                "01/01/1991",
                                "Java Masterclass");

            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/10/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/10/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

        for (int i =1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Harry";
                        case 4 -> "Lisa";
                        case 5 -> "Tim";
                        default -> "Anonymous";
                    },
                    "01/01/1991",
                    "Java Masterclass");

            System.out.println(s);
        }
    }
}
