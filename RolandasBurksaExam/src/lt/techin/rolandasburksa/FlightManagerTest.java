package lt.techin.rolandasburksa;

import lt.techin.exam.BaseFlightManagerTest;
import lt.techin.exam.FlightManager;

public class FlightManagerTest extends BaseFlightManagerTest {
    @Override
    protected FlightManager createFlightManager() {
        return new FlightManagerTestImplementation();
    }
}
