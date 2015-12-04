import static java.lang.Math.*;

public enum RomanNumeral {

    I(1, 0), V(5, 0), X(1, 1), L(5, 1), C(1, 2), D(5, 2), M(1, 3);

    private final int value;
    private final int factor;

    RomanNumeral(int value, int factor) {
        this.value = value;
        this.factor = factor;
    }

    private boolean canApplyTo(int a) {
        a = (int) (a / pow(10.0, factor));
        System.out.println(factor);
        System.out.println(a);
        return (a < 3 || (a >= 5 && a < 8)) && (value + a < 10);
    }

    public int applyTo(int a) {
        if (canApplyTo(a))
            return (int) (a + ((a != 5 * value ? value : - value) * pow(10.0, factor)));
        else throw new IllegalArgumentException("blah");
    }

}
ssw