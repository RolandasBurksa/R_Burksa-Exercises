package lt.techin.rolandas;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Zmogus", 45);
        Human human2 = new Human("Zmogus", 45);

        System.out.println(human1.equals(human2));
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());


//        Human human3 = new Human("Akvile", 55);
//        Human human4 = new Human("Tadas", 15);


//        human1.eat();
//        System.out.println(human1);

//        Human[] humans = new Human[10];
//        humans[0] = human1;
//        humans[1] = human2;
//        humans[2] = human3;
//        humans[3] = human4;
//        humans[11] = human1;  - uz masyvo ribu
//        System.out.println(humans.length);

//        ArrayList<Human> humans = new ArrayList<>();
//        humans.add(human1);
//        humans.add(human2);
//        humans.add(human3);
//        humans.add(human4);
//        humans.add(human1);
//        humans.add(human2);
//        humans.add(human3);
//        System.out.println(humans);
//        System.out.println(humans.size());
//        System.out.println(humans.remove(5));
//        System.out.println(humans.size());
//        System.out.println(humans.remove(human1));
//        System.out.println(humans.size());
//        for (Human element : humans){
//            System.out.println(element.getName() + ":" + element.getAge()) ;
//        }
//        for (int i = 0; i < humans.size(); i ++){
//            System.out.println(humans.get(i));
//        }

//        System.out.println(Arrays.toString(humans));


        int value = 0;
        do {
            System.out.print(value + ", " );
            value++;
        } while (value < 11);
        System.out.println(value + " the last value.");

        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};

        if(arr1 == arr2){
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
        if (Arrays.equals(arr1,arr2)){
            System.out.println( "Same to");
        } else {
            System.out.println("Not same to");
        }

    }


}


