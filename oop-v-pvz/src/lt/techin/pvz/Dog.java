package lt.techin.pvz;

public class Dog extends Pet{

    private  String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void auau(){
        System.out.println("auau");
    }

    public void  makeNoise(){
        auau();
    }
}
