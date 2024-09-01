package section_27;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    class CurrenciesDoNotMatchException extends Exception {
//        public void CurrenciesDoNotMatchException(String msg) {
//            super(msg);
//        }
    }

    public void add(Amount that) throws CurrenciesDoNotMatchException {
        if (!this.currency.equals(that.currency)) {
//            throw new Exception("Currencies don't match");
            throw new CurrenciesDoNotMatchException();
        }
        this.amount = this.amount + that.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }

}

public class ThrowingExceptionRunner {

    public static void main(String[] args) throws Amount.CurrenciesDoNotMatchException {
        Amount amount1 = new Amount("EU" , 10);
        Amount amount2 = new Amount("USD", 20);
        amount1.add(amount2);
        System.out.println(amount1);

    }
}
