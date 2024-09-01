package section_27;

import java.math.BigDecimal;

class Test implements Comparable<String> {

    @Override
    public int compareTo(String o) {
        return 0;
    }
}

public class IdeTips {

    public static void main(String[] args) throws InterruptedException {
        DummyForTest dt = new DummyForTest("Name", 10);
        dt.doSomething();

        BigDecimal bd = new BigDecimal(25);
        Thread.sleep(1000);
        System.out.println(bd + " Parrots");
    }
}
