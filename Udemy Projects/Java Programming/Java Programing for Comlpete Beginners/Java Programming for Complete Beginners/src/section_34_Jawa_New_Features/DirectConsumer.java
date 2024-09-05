package section_34_Jawa_New_Features;

import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {

    private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

    public static void main(String[] args) {
        BubbleSort util = new BubbleSort();
        List<String> sorted = util.sort(List.of("Andrius", "Tandrius", "Sandrius", "Landrius"));
        logger.info(sorted.toString());
    }
}
