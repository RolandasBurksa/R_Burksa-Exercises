package section_34_Jawa_New_Features;

public class InterfaceRunner {

    interface Dog {
        void barks();

        void plays();
    }

    interface BigDog {
        void barksBD();

        void playsBD();
    }

    interface SmallDog {
        void barksSD();

        void playsSD();
    }

    interface KingDog extends Dog, BigDog, SmallDog {
        void barkKing();
    }

    class KingDogs implements KingDog {

        @Override
        public void barkKing() {
            System.out.println("KingDog is barking...");
        }

        @Override
        public void barksBD() {
            System.out.println("BigDog is barking...");
        }

        @Override
        public void playsBD() {
            System.out.println("BigDog is playing...");
        }

        @Override
        public void barks() {
            System.out.println("Dog is barking...");
        }

        @Override
        public void plays() {
            System.out.println("Dog is playing...");
        }

        @Override
        public void barksSD() {
            System.out.println("SmallDog is barking...");
        }

        @Override
        public void playsSD() {
            System.out.println("SmallDog is playing...");
        }
    }

    public static void main(String[] args) {
        InterfaceRunner runner = new InterfaceRunner();
        KingDog myDog = runner.new KingDogs();
        myDog.barkKing();
    }
}

