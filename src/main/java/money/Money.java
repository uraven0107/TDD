package money;

class Money implements Expression{
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
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return this.currency;
    }

    Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Expression added) {
        return new Sum(this, added);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}
