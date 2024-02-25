package lt.techin.rolandas;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        if (name.isEmpty() || name == null) {
            System.out.println("Not correct name ...");
        } else {
            this.name = name;
        }
        setAge(age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Not correct name ...");
        } else {
            this.age = age;
        }

    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat () {
        System.out.println("...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        return name.equals(human.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
