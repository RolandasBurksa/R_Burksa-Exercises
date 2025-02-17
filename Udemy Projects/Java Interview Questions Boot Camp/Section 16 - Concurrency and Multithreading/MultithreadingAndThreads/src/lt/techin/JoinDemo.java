package lt.techin;

public class JoinDemo {

    public static void main(String[] args) {

        Runnable2 r2 = new Runnable2();
        Thread t2 = new Thread(r2);

        Runnable1 r1 = new Runnable1(t2);
        Thread t1 = new Thread(r1);

        t1.start();
        t2.start();
    }
}

class Runnable1 implements Runnable{

    Thread t;

    public Runnable1(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread1");
        }
    }
}

class Runnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread2");
        }
    }
}
