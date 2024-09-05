package section_34_Jawa_New_Features;

import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer {

    private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        MySortingUtil util = new MySortingUtil();
        List<String> sorted = util.sort(List.of("Andrius", "Tandrius", "Sandrius", "Landrius"));
        logger.info(sorted.toString());
    }
}
