package section_27;

//extends Thread
//implements Runnable

class Task1 extends Thread {
    public void run(){
        System.out.println("\n Task1 Started");
        for (int i = 101; i < 199; i++) {
            System.out.println(i + " ");
        }
        System.out.println("\n Task1 Done");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("\n Task2 Started");
        for (int i = 201; i < 299; i++) {
            System.out.println(i + " ");
        }
        System.out.println("\n Task2 Done");
    }
}

public class TreadBasicsRunner {

    public static void main(String[] args) throws InterruptedException {

        //Task 1
//        for (int i = 101; i < 199; i++) {
//            System.out.println(i + " ");
//        }
//        System.out.println("\n Task1 Done");

        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start();


        //Task 2
//        for (int i = 201; i < 299; i++) {
//            System.out.println(i + " ");
//        }
//        System.out.println("\n Task2 Done");

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(1);
        task2Thread.start();

        //wait for task1 to complete
        task1.join();

        //wait for task2 to complete
        task2Thread.join();


        //Task 3
        for (int i = 301; i < 399; i++) {
            System.out.println(i + " ");
        }
        System.out.println("\n Task3 Done");
        System.out.println("---   ---   ---");
        System.out.println("\n The Main method is Done");
    }
}
