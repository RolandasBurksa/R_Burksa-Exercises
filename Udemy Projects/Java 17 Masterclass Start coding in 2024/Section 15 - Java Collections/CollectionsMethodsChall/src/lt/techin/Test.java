package lt.techin;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int x = 10;
        List<Runnable> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int finalI = i;
            list.add(() -> System.out.println(10 + finalI));
        }

        x = 20;
        list.forEach(Runnable::run);
    }
}
