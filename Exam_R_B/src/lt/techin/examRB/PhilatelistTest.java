package lt.techin.examRB;

import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class PhilatelistTest extends PhilatelistBaseTest {
    @Override
    protected Philatelist getPhilatelist() {
        return new PhilatelistImplementation();
    }
}
