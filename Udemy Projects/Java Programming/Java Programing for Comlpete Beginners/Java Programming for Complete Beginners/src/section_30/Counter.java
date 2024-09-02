package section_30;

public class Counter {
    int i = 0;

   synchronized public void increment() {
        // when we use multithread
        i++;  //15
        //get i 15 15
        //increment 16  16
        //set i 16  17
    }

    public int getI() {
        return i;
    }
}
