package lt.techin.rolandas_001;

import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class PhilatelistTest extends PhilatelistBaseTest
{
    @Override
    protected Philatelist getPhilatelist() {
        return new  NewPhilatelist();
    }
}
