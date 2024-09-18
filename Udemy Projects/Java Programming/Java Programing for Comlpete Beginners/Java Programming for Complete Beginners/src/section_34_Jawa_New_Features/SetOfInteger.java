package section_34_Jawa_New_Features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SetOfInteger {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            intset.add(rand.nextInt(30));
//            System.out.println(intset);
        }
        System.out.println(intset);

        // Generate 100 random integers between 0 and 29, add to set, and print
        IntStream.range(0, 100)
                .map(i -> rand.nextInt(30))   // Generate random integers
                .forEach(n -> {               // For each random integer:
                    intset.add(n);            // Add to the set
                    System.out.println(intset); // Print the set
                });

        System.out.println("__________________________");
        // Generate 100 random integers and collect them into the set
        IntStream.range(0, 100)
                .map(i -> rand.nextInt(30))
                .forEach(intset::add);

        System.out.println(intset);

        System.out.println("__________________________");
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
        double sum = 0;
        for (double rev:revenue){
            sum +=rev;
        }
        System.out.println(sum / revenue.length);

        System.out.println("--------     --------");
        Arrays.stream(revenue).sum();
        System.out.println(sum / revenue.length);

        System.out.println("***   ___   ***");
        // Calculate the average using streams
        double average = Arrays.stream(revenue)  // Create a DoubleStream from the revenue array
                .average()        // Calculate the average
                .orElse(0);       // Handle the case where the array might be empty

        System.out.println(average);
    }
}
