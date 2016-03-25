package roman;

import static java.lang.Math.pow;

public class AbstractRomanNumeral {

    private final RomanNumeralType rnl;
    private final int factor;
    private final int value;

    private AbstractRomanNumeral(int factor, RomanNumeralType rnl) {
        this.factor = factor;
        this.rnl = rnl;
        this.value = (int) (rnl.getValue() * pow(10.0, factor));
    }

    public int applyTo(final int input) {
        final int scaledInput = scaleInput(input);
        if (rnl.canApplyTo(scaledInput))
            return input + getAddend(scaledInput);
        else throw new IllegalArgumentException("Cannot apply " + scaledInput + " to " + rnl);
    }

    private int scaleInput(int input) {
        return (int) (input / pow(10.0, factor));
    }

    private int getAddend(int a) {
        return rnl.shouldSubtract(a) ? -value : value;
    }

    public static AbstractRomanNumeral build(int factor, RomanNumeralType rnl) {
        return new AbstractRomanNumeral(factor, rnl);
    }

}
