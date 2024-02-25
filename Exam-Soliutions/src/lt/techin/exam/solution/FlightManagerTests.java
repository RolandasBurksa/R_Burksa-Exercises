package lt.techin.exam.solution;

import lt.techin.exam.BaseFlightManagerTest;
import lt.techin.exam.FlightManager;

public class FlightManagerTests extends BaseFlightManagerTest {
    @Override
    protected FlightManager createFlightManager() {
        return new FlightManagerImplements();
    }
}
