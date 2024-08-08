package section_19;

/**
 * This method determines whether there's an element greater than a given number in an array.
 *
 * @param array The array to search through.
 * @param number The number to compare with the array elements.
 * @return True if there's an element greater than the given number in the array, false otherwise.
 */

public class ArrayMagic {

    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        if (array == null || array.length == 0) {
            return false;
        }

        for (int var : array) {
            if (var > number) {
                return true;
            }
        }
        return false;
    }
}
