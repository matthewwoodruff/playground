import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralParserTest {

    private RomanNumeralParser romanNumeralParser;

    @Before
    public void setUp() throws Exception {
        romanNumeralParser = new RomanNumeralParser();
    }

    @Test
    public void shouldParseI() throws Exception {
        RomanNumeral[] numerals = {RomanNumeral.I};
        assertThat(romanNumeralParser.parse(numerals), is(1));
    }

    @Test
    public void shouldParseII() throws Exception {
        RomanNumeral[] numerals = {RomanNumeral.I, RomanNumeral.I};
        assertThat(romanNumeralParser.parse(numerals), is(2));
    }

    @Test
    public void shouldParseIV() throws Exception {
        RomanNumeral[] numerals = {RomanNumeral.I, RomanNumeral.V};
        assertThat(romanNumeralParser.parse(numerals), is(6));
    }

}