package section_20;

public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
//        fan.isOn(true);
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte) 2);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }


}
