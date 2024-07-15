package chapter03;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
//         dog1.bark();
        dog1.name = "Bart";
        dog1.bark();

        // An array of dogs
        Dog[] myDogs = new Dog[3];

        // Putting some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // Accessing the Dogs in an array
        myDogs[0].name = "Fred";
        myDogs[1].name = "Amicus";

        myDogs[1].eat();

        // What is myDogs[2] name?
        System.out.print("Last dogs name is ");
        System.out.println(myDogs[2].name);

        // Looping through the array
        // Telling all the dogs to bark
        int x = 0;
        while ( x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.println(name + " says Au!.");
    }

    public void eat(){
        System.out.println(name + " -- eats the cat!");
    }

    public void chaseCat(){
    }

}
