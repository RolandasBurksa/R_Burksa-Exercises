package section_20;

public class ChessGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("***   ---   ***");
        System.out.println("Aukstyn shach..");
    }

    @Override
    public void down() {
        System.out.println("Zemyn shach.. ");
    }

    @Override
    public void left() {
        System.out.println("Kairen shach..");
    }

    @Override
    public void right() {
        System.out.println("Desinen shach..");
    }
}
