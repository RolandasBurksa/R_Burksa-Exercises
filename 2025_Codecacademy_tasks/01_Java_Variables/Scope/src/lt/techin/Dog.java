package lt.techin;

public class Dog {

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void speak(String name){
        // Prints the instance variable named name
        System.out.println(this.name);

        // Prints the local variable named name
        System.out.println(name);
    }

    public static void main(String[] args) {

        Dog dogOne = new Dog("Amsius");

        dogOne.speak("Suo kuris kalba");
    }



}
