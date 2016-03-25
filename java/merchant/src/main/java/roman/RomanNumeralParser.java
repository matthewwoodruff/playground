package roman;

import java.util.List;

import static java.util.Collections.reverse;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.of;

public class RomanNumeralParser {

    public int parse(List<RomanNumeral> numerals) {
        final RomanState romanState = new RomanState();
        reverse(numerals);
        numerals.stream().forEach(romanState::apply);
        return romanState.getValue();
    }

    public int parse(String input) {
        return parse(toRomanNumerals(input));
    }

    public List<RomanNumeral> toRomanNumerals(String input) {
        return of(input.split("")).map(RomanNumeral::valueOf).collect(toList());
    }
}
