package lt.techin.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

   private MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeMemberArray() {

        //        MyMath math = new MyMath();
        //        System.out.println(result);
        assertEquals(6, math.calculateSum(new int[]{1,2,3}));
    }

    @Test
    void testTwo() {

        //        MyMath math = new MyMath();
        int result = math.calculateSum(new int[]{});
//        System.out.println(result);
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

}