package roman;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
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
        List<RomanNumeral> romanNumerals = asList(RomanNumeral.I);
        assertThat(romanNumeralParser.parse(romanNumerals), is(1));
    }

    @Test
    public void shouldParseRomanNumeralStringIntoRomanNumeralArray() throws Exception {
        assertThat(romanNumeralParser.toRomanNumerals("IV"), is(asList(RomanNumeral.I, RomanNumeral.V)));
    }

    @Test
    public void shouldParseII() throws Exception {
        List<RomanNumeral> romanNumerals = asList(RomanNumeral.I);
        assertThat(romanNumeralParser.parse(romanNumerals), is(1));
    }

    @Test
    public void shouldParseIV() throws Exception {
        List<RomanNumeral> romanNumerals = asList(RomanNumeral.V, RomanNumeral.I);
        assertThat(romanNumeralParser.parse(romanNumerals), is(6));
    }

    @Test
    public void shouldParseRomanNumeralString() throws Exception {
        assertThat(romanNumeralParser.parse("IV"), is(4));
    }

    @Test
    public void shouldParseVIII() throws Exception {
        assertThat(romanNumeralParser.parse("VIII"), is(8));
    }

    @Test
    public void shouldParseMCMXXIV() throws Exception {
        assertThat(romanNumeralParser.parse("MCMXXIV"), is(1924));
    }

    @Test
    public void shouldParseMMMCLXVII() throws Exception {
        assertThat(romanNumeralParser.parse("MMMCLXVII"), is(3167));
    }

    @Test
    public void shouldParseMMCMXIV() throws Exception {
        assertThat(romanNumeralParser.parse("MMCMXIV"), is(2914));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldntParseMXXM() throws Exception {
        romanNumeralParser.parse("MXXM");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldntParseVV() throws Exception {
        romanNumeralParser.parse("VV");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldntParseMMMM() throws Exception {
        romanNumeralParser.parse("MMMM");
    }

}