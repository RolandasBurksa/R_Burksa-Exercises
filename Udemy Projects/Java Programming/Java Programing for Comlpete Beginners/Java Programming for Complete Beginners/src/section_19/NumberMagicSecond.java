package section_19;

import java.util.ArrayList;
import java.util.List;

public class NumberMagicSecond {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     *
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
        // TODO: Write your code here
        if (number <= 0 || limit <= 0) {
            return new ArrayList<>();
        }

        List<Integer> multiples = new ArrayList<Integer>();
//        int sum = 0;
        for (int i = number; i < limit; i+= number) {
//            sum +=i;
            multiples.add(i);
        }
        return multiples;
    }
}
