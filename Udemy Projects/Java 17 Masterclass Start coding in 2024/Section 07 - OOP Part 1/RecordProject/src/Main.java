public class Main {

    public static void main(String[] args) {

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
