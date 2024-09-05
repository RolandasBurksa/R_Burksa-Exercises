package section_34_Jawa_New_Features;

import java.util.List;

public class MySortingUtil {

    public List<String> sort(List<String> names) {
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);
    }
}
