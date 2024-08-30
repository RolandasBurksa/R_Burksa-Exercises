package section_26;

import java.util.List;
import java.util.Optional;

public class FProgramingMagicTwo {

    public static int findMaxEvenNumbers(List<Integer> numbers) {

        if (numbers == null) {
            return 0;
        }

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compare);
        return maxEven.orElse(0);
    }
}
