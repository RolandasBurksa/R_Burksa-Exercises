package lt.udemy.rolandas.section11;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    BigDecimal principal;
    BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));


    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        // Total Value = principal + principal * interest * noOfInterest
       BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(BigDecimal.valueOf(noOfYears)));

        return totalValue;
    }
}
