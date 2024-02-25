package lt.techin.rolandas;

public class Square extends Shape{
    public  Square(double length) {
        super(length);
    }
    @Override
    public double countArea() {
        return 0;
    }
    @Override
    public void getInfo() {
        System.out.println("...");
    }
}

