package roman;

public class RomanState {

    private int value = 0;

    public void apply(RomanNumeral numeral) {
        value = numeral.applyTo(value);
    }

    public int getValue() {
        return value;
    }
}
