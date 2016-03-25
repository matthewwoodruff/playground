package roman;

public class RomanNumeralFive implements RomanNumeralType {
    @Override
    public boolean canApplyTo(int a) {
        return a <= 3;
    }

    @Override
    public int getValue() {
        return 5;
    }

    public static RomanNumeralFive five() {
        return new RomanNumeralFive();
    }
}
