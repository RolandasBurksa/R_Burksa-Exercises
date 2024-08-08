package section_19;

/**
 * This method finds and returns the second largest element in the given array.
 *
 * @param array the array in which to find the second largest element
 * @return the second largest element in the array
 */

public class ArrayMagicSecond {

    public int findSecondLargestElement(int[] array) {

        if (array.length < 2) {
            return -1;
        }

        int numberFirst = Integer.MIN_VALUE;
        int numberSecond = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > numberFirst) {
                numberSecond = numberFirst;
                numberFirst = number;
            } else if (number > numberSecond && number != numberFirst) {
                numberSecond = number;
            }
        }
        if (numberSecond == Integer.MIN_VALUE) {
            return -1;
        }
        return numberSecond;
    }
}

