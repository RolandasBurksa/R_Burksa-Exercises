
public class Main {

    public static void main(String[] args) {

    Wall wall = new Wall(5, 4);
        System.out.println("aria = " + wall.getArea());

        wall.setHeight(1.5);
        System.out.println("width = " + wall.getWidth());

        System.out.println("height = " + wall.getHeight());
        System.out.println(" area = " + wall.getArea());


        Point point = new Point(2, 8);
        System.out.println("The distance is = " + point.distance());
        point.setX(2);
        point.setY(8);
        System.out.println("The distance is = " + point.distance());

    }
}
