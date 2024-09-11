package section_34_Jawa_New_Features;

public class ParcelRunner {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println("Shipping to: " + d.readLabel());
    }

    public static void main(String[] args) {
        ParcelRunner p = new ParcelRunner();
        p.ship("Brasil");
        ParcelRunner q = new ParcelRunner();

        ParcelRunner.Contents c = q.contents();
        ParcelRunner.Destination d = q.to("Germany");
        System.out.println("Destination: " + d.readLabel());
    }
}


