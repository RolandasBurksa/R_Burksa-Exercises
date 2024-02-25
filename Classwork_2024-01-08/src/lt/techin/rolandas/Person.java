package lt.techin.rolandas;

public class Person {

    public String name = "Jonas";
    public int age = 34;

    public String getPersonData() {
        return name + ":" + age;
    }

    public String getPersonData(String carModel) {
        return name + ":" + age + ":" + carModel;
    }
}
