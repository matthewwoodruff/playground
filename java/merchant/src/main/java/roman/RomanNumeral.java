package roman;

import static roman.AbstractRomanNumeral.build;
import static roman.RomanNumeralFive.five;
import static roman.RomanNumeralOne.one;

public enum RomanNumeral {

    I(build(0, one())),
    V(build(0, five())),
    X(build(1, one())),
    L(build(1, five())),
    C(build(2, one())),
    D(build(2, five())),
    M(build(3, one()));

    private final AbstractRomanNumeral arn;

    RomanNumeral(AbstractRomanNumeral arn) {
        this.arn = arn;
    }

    public int applyTo(int input) {
        return arn.applyTo(input);
    }

}
