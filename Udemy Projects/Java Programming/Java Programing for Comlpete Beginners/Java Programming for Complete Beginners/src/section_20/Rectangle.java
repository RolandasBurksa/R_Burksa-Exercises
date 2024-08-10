package section_20;

public class Rectangle {
    // state
    private int length;
    private int with;

    // creation
    public Rectangle(int length, int with) {
        this.length = length;
        this.with = with;
    }

    // operation
    public int getLength() {
        return length;
    }

    public int getWith() {
        return with;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int area(){
        return length * with;
    }

    public int perimeter() {
        return 2 * (length + with);
    }

    // public String toString()
    public String toString() {
        return String.format("length - %d , with - %d , area - %d, perimeter - %d", length, with, area(), perimeter());
    }
}
