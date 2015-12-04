public class RomanNumeralParser {

    public int parse(RomanNumeral... numerals) {
        RomanState romanState = new RomanState();

        for(int i = 0; i < numerals.length; i++) {
            romanState = romanState.apply(numerals[i]);
        }

        return romanState.getValue();
    }

}
