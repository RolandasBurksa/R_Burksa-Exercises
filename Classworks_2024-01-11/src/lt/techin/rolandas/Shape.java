package lt.techin.rolandas;

public abstract class Shape {
    private double a;
    private double b;

    public Shape(double a, double b) {
        if(a <= 0 || b <= 0){
            System.out.println("Parameter is not good...");
        } else {
            this.a = a;
            this.b = b;
        }
    }

    public Shape(double length) {
        this.a = length;
        this.b = length;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

//    public double countArea() {       // Cia realus metodas
//        return a * b;
//
//    }
    public abstract double countArea();     // Cia abstraktus metodas to kur auksciau

//    public void getInfo() {
//        System.out.println("a = " + a + ", b = " + b);
//    }
    public abstract void getInfo();
}
