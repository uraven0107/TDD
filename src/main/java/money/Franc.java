package money;

public class Franc {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Franc d = (Franc) obj;
        return this.amount == d.amount;
    }
}
