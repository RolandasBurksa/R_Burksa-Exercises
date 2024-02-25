package lt.techin.rolandas;

public class Circle extends Shape{
    public Circle(double length){
        super(length);
    }

    @Override
    public double countArea() {
        return 2 * Math.PI * getA();
    }

    @Override
    public void getInfo() {
        System.out.println("Radius: " + getA());
    }
}
