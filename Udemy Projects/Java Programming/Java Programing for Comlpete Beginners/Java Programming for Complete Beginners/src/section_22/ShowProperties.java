package section_22;

public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("___   ___   ___");
        System.out.println(System.clearProperty("user.name"));
        System.out.println("___   ___   ___");
        System.out.println(
                System.getProperty("java.library.path"));
        System.out.println("___   ___   ___");
        System.out.println(
                System.getProperty("java.vm.info"));
    }
}
