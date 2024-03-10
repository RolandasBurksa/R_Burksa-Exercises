package lt.techin.pvz;

import java.util.ArrayList;
import java.util.List;

public class App {


public static void main(String[] args) {

    List<Pet> pets = new ArrayList<>();

    Pet lessie = new Dog("Lessie", 8, "brown");
    Cat felix = new Cat("Felix", 5);

    Dog dog = (Dog) lessie;
    dog.auau();

    pets.add(lessie);
    pets.add(felix);

    for (Pet pet: pets){
        if (pet instanceof Dog){
            ((Dog)pet).auau();
        }
    }
    for (Pet pet: pets){
        pet.makeNoise();
    }


    System.out.println(pets.get(0));


//    pets.add(lessie);

    int a;
//    Pet felix = new Pet("Felix", 5);
    Pet felix2 = new Pet("Felix", 5);
//    Cat felix2 = felix;
    felix2.setName("kitas");
//    System.out.println(felix == felix2);
    System.out.println(felix.toString());

    pets.add(felix);
    if(!pets.contains(felix)){
        pets.add(felix2);
    }
    System.out.println(pets.size());


    Pet garfield = new Pet("Garfield",10 );

    System.out.println(felix.getAge());
    System.out.println(felix.getName());

}

}