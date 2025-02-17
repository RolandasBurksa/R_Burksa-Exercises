package lt.techin;

public class YieldDemo {

    public static void main(String[] args) {

        MyR r = new MyR();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

class MyR implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}