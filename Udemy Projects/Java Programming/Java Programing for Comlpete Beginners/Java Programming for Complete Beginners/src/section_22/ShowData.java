package section_22;

public class ShowData {
    int id;
    String name;
    char A;

    public static void main(String[] args) {
        ShowData values = new ShowData();
        System.out.println("int - " + values.id);
        System.out.println("name - " + values.name);
        System.out.println("char - " + values.A);

        // or choice
        if (values.A == '\u0000') {
            System.out.println("char - [null character]");
        } else {
            System.out.println("char - " + values.A);
        }
    }
}
