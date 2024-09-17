package lt.techin.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {

    List<String> todo = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void test(){
        boolean test = todo.contains("AWS");

        assertEquals(true, test);
        assertEquals(3,todo.size());

    }

}