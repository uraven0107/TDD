package money;

public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Dollar d = (Dollar) obj;
        return this.amount == d.amount;
    }
}
