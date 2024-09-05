package section_31_Java_Tips;

enum Money {
    DOLLAR, POUND, YEN, RUB
}

public class MoneyTypeRunner {

    public static void main(String[] args) {
        Money amountName = Money.YEN;
        System.out.println(amountName + " - " +amountName.ordinal());

        for (Money amount : Money.values()) {
            System.out.println(amount + " " + amount.ordinal());
        }
    }
}
