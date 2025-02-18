package lt.techin;

public class YieldDemoTwo {

    public static void main(String[] args) {

        MyRunnableA r = new MyRunnableA();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }
}

class MyRunnableA implements Runnable {

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
                Thread.yield();
            }
        }
    }

