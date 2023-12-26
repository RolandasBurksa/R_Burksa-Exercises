package lt.techin.rolandas;

public class Main {
/*
Sukuriame klases Main metoda
 */
    public static void main(String[] args) {
        byte myByte1;   // Deklaruojame primityvaus tipo byte kintamaji
        myByte1 = 10;   // Priskiriame kintamajam reiksme
        byte myByte2;
        myByte2 = 20;

        short myShort1;   // Deklaruojame primityvaus tipo short kintamaji
        myShort1 = 60;   // Priskiriame kintamajam reiksme
        short myShort2;
        myShort2 = 30;
/*
Atliekame veiksmus su kintamaisiais, ir isvedame rezultatus i ekrana
 */
        System.out.println("myByteSum = "+ (myByte1 + myByte2));
        System.out.println("myByteDev = "+ (myByte2 / myByte1));
        System.out.println("myShortSum = "+ (myShort1 + myShort2));
        System.out.println("myShortMultp = "+ (myShort1 * myShort2));
        System.out.println("myByteShortSum = "+ (myByte1 + myShort1));
        System.out.println("myShortByteDev = "+ (myShort1 / myByte1));
    }
}
