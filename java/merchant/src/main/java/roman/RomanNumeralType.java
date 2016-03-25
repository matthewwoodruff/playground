package roman;

public interface RomanNumeralType {

    default boolean shouldSubtract(int a) {
        return a == 5 || a == 10 ;
    }

    boolean canApplyTo(int a);
    int getValue();

}
