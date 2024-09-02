package section_30;

public class BiCounter {
    private int i = 0;
    private int j = 0;

   synchronized public void incrementI() {
        i++;
        //get i
       //increment i
       //set i
    }

    public int getI() {
        return i;
    }

    synchronized public void incrementJ() {
       j++;
    }

    public int getJ() {
        return j;
        //get j
        //increment j
        //set j
    }
}




