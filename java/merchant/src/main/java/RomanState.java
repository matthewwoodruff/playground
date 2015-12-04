public class RomanState {

    private static final int DEFAULT = 0;

    private final int value;

    public RomanState() {
        this(DEFAULT);
    }

    public RomanState(int value) {
        this.value = value;
    }

    public RomanState apply(RomanNumeral numeral) {
        return new RomanState(numeral.applyTo(value));
    }

    public int getValue() {
        return value;
    }
}
