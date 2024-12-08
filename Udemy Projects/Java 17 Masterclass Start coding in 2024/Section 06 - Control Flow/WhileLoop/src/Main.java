public class Main {

    public static void main(String[] args) {

        System.out.println("1------");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("2------");

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("3------");

        int k = 1;
        while (true) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
        }

        System.out.println("4------");

        int l = 1;
        boolean isReady = false;
        do {
            if (l > 5) {
                break;
            }
            System.out.println(l);
            l++;
        } while (isReady);

        System.out.println("5------");

        int u = 1;
        boolean isReadyB = false;
        do {
            if (u > 5) {
                break;
            }
            System.out.println(u);
            u++;
            isReadyB = (u > 0);
        } while (isReadyB);
    }
}
