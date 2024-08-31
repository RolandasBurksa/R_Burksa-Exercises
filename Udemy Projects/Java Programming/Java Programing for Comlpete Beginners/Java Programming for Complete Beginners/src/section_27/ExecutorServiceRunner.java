package section_27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

    private final int number;

    public Task(int number){
        this.number = number;
    }

    public void run() {
        System.out.print("\nTask " + number + " Started ");

        for (int i = number * 100; i <= number * 100 + 99; i++){
            System.out.print(i + " ");

            System.out.print("\nTask " + number + " Started ");
        }
    }
}

public class ExecutorServiceRunner {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));



//        executorService.execute(new Thread(new Task2()));
//        System.out.println("\nTask3 Kicked Off");

        //Task 3
//        for (int i = 301; i < 399; i++) {
//            System.out.println(i + " ");
//        }
//        System.out.println("\n Task3 Done");
//        System.out.println("---   ---   ---");
//        System.out.println("\n The Main method is Done");

        executorService.shutdown();
    }
}
