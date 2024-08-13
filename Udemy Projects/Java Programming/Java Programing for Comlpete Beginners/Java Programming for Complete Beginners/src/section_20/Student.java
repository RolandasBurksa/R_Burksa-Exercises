package section_20;

public class Student extends Person{
    private String collegeName;
    private int year;

    public String getCollegeName() {
        return collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
