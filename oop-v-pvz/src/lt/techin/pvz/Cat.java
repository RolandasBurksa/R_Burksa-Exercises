package lt.techin.pvz;

public class Cat extends Pet{

    public Cat(String name, int age) {
        super(name, age);
    }

    public  void miau(){
        System.out.println("miau");
    }

    public void makeNoise(){
        miau();
    }
}
