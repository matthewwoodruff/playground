package roman;

public class RomanNumeralOne implements RomanNumeralType {
    @Override
    public boolean canApplyTo(int a) {
        return a < 3 || a == 5 || a == 10;
    }

    @Override
    public int getValue() {
        return 1;
    }

    public static RomanNumeralOne one() {
        return new RomanNumeralOne();
    }
}
