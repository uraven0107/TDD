package money;

abstract class Money {
    protected int amount;

    public boolean equals(Object o) {
        Money money = (Money) o;
        return this.amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);
}
