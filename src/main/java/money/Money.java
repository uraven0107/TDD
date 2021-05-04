package money;

class Money {
    protected int amount;
    protected String currency;

    Money (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object o) {
        Money money = (Money) o;
        return this.amount == money.amount
                && currency().equals(money.currency());
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return this.currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }
}
