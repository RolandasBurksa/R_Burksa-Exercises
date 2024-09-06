package section_34_Jawa_New_Features;

public class ChocolateChip extends Cookie {

    public ChocolateChip() {
        System.out.println("Constructor ChocolateChip from ChChip class");
    }
    public void chomp(){
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
