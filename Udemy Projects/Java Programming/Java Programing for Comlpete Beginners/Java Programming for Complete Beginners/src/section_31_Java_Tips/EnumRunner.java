package section_31_Java_Tips;

import java.util.ArrayList;
import java.util.Arrays;

enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);

    private int value;

    private Season(int value){
        this.value = value;
    }
    // 0  ,   1   ,   2   ,   3


    public int getValue() {
        return value;
    }
}

public class EnumRunner {

    public static void main(String[] args) {
        Season season = Season.FALL;

        Season season1 = Season.valueOf("SPRING");
        System.out.println(season1);
        System.out.println(season1.ordinal());
        System.out.println(Season.SUMMER.getValue());

        System.out.println(Arrays.toString( Season.values()));
    }
}
