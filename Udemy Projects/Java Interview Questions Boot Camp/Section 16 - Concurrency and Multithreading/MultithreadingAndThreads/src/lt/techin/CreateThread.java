package lt.techin;

public class CreateThread {

    public static void main(String[] args) {

        //Thread
        WorkerThread w = new WorkerThread();
        w.start();

//        //Runnable1
        MyRunnableA runnable = new MyRunnableA();
        Thread t = new Thread(runnable);
        t.start();

    }
}
        //extending Thread class
class WorkerThread extends Thread {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Executing job 1");
                }
            }
        }

        //implementing Runnable1 Interface
class MyRunnable implements Runnable {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Executing job 2");
                }
            }
        }

