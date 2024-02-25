package lt.techin.rolandas;

public class MyMath {
    double radius;
     static final double PI = 3.1428;

    public MyMath(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * PI  * radius;
    }
}
