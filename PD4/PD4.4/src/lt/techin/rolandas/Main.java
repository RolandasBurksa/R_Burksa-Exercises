package lt.techin.rolandas;

public class Main {
/*
Sukuriame klases Main metoda
 */
    public static void main(String[] args) {

        System.out.println("Priskirimo opeatoriaus pavyzdys:");
/*
Inicijuojame kintamuosius
 */
        int num;
        String name;
        System.out.println("Turime kintamuosius: skaiciu - num ir zodi/stringa - name.");
        num = 10;
        name = "ABC-def";
/*
Atliekame skaiciavimus ir isvedame rezultatus
 */
        System.out.println("Panaudodami priskyrimo operatoriu \' = ' priskiriame jiems sekancias reiksmes : num = " + num + " ir name = " + name + ".");
        System.out.println("____________________");
        System.out.println("Sudeties ir priskirimo opeatoriaus pavyzdys: num1 = 10, num2 = 1");
        int num1, num2;
        num1 = 10;
        num2 = 1;
        num2 += num1;
        System.out.println("Panaudodami sudeties ir priskyrimo operatoriu num2 += num1,  gauname: num1 = " + num1 + " ir num2 = " + num2 + ".");
        System.out.println("____________________");
        System.out.println("Atimties ir priskirimo opeatoriaus pavyzdys: num3 = 10, num4 = 1");
        int num3, num4;
        num3 = 10;
        num4 = 1;
        num4 -= num3;
        System.out.println("Panaudodami atimties ir priskyrimo operatoriu num4 -= num3, gauname: num3 = " + num3 + " ir num4 = " + num4 + ".");
        System.out.println("____________________");
        System.out.println("Sudauginimo ir priskirimo opeatoriaus pavyzdys: num5 = 10, num6 = 2");
        int num5, num6;
        num5 = 10;
        num6 = 2;
        num6 *= num5;
        System.out.println("Panaudodami sudauginimo ir priskyrimo operatoriu num6 *= num5, gauname: num5 = " + num5 + " ir num6 = " + num6 + ".");
        System.out.println("____________________");
        System.out.println("Dalybos ir priskirimo opeatoriaus pavyzdys: num7 = 10, num8 = 20");
        int num7, num8;
        num7 = 10;
        num8 = 20;
        num8 /= num7;
        System.out.println("Panaudodami padalinimo ir priskyrimo operatoriu num8 /= num7, gauname: num7 = " + num7 + " ir num8 = " + num8 + ".");
        System.out.println("____________________");
        System.out.println("Modulio ir priskirimo opeatoriaus pavyzdys: num09 = 11, num10 = 20");
        int num09, num10;
        num09 = 11;
        num10 = 20;
        num10 %= num09;
        System.out.println("Panaudodami modulio ir priskyrimo operatoriu num09 /= num10, gauname: num09 = " + num09 + " ir num10 = " + num10 + ".");
        System.out.println("____________________");
















    }
}
