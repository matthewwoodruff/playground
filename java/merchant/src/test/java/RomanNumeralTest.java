import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralTest {

    @Test
    public void ICanBeAppliedTo0() throws Exception {
        assertThat(RomanNumeral.I.applyTo(0), is(1));
    }

    @Test
    public void ICanBeAppliedTo1() throws Exception {
        assertThat(RomanNumeral.I.applyTo(1), is(2));
    }

    @Test
    public void ICanBeAppliedTo2() throws Exception {
        assertThat(RomanNumeral.I.applyTo(2), is(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ICannnotBeAppliedTo3() throws Exception {
        RomanNumeral.I.applyTo(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ICannnotBeAppliedTo4() throws Exception {
        RomanNumeral.I.applyTo(4);
    }

    @Test
    public void ICanBeAppliedTo5() throws Exception {
        assertThat(RomanNumeral.I.applyTo(5), is(4));
    }

    @Test
    public void VCanBeAppliedTo0() throws Exception {
        assertThat(RomanNumeral.V.applyTo(0), is(5));
    }

    @Test
    public void VCanBeAppliedTo1() throws Exception {
        assertThat(RomanNumeral.V.applyTo(1), is(6));
    }

    @Test
    public void ICanBeAppliedTo6() throws Exception {
        assertThat(RomanNumeral.I.applyTo(6), is(7));
    }

    @Test
    public void ICanBeAppliedTo7() throws Exception {
        assertThat(RomanNumeral.I.applyTo(7), is(8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ICannotBeAppliedTo8() throws Exception {
        RomanNumeral.I.applyTo(8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ICannotBeAppliedTo9() throws Exception {
        RomanNumeral.I.applyTo(9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void VCannotBeAppliedTo5() throws Exception {
        RomanNumeral.V.applyTo(5);
    }

    @Test
    public void ICanBeAppliedTo10() throws Exception {
        assertThat(RomanNumeral.I.applyTo(10), is(9));
    }

    @Test
    public void XCanBeAppliedTo0() throws Exception {
        assertThat(RomanNumeral.X.applyTo(0), is(10));
    }

    @Test
    public void XCanBeAppliedTo1() throws Exception {
        assertThat(RomanNumeral.X.applyTo(1), is(11));
    }

    @Test
    public void XCanBeAppliedTo2() throws Exception {
        assertThat(RomanNumeral.X.applyTo(2), is(12));
    }

    @Test
    public void XCanBeAppliedTo3() throws Exception {
        assertThat(RomanNumeral.X.applyTo(3), is(13));
    }

    @Test
    public void XCanBeAppliedTo4() throws Exception {
        assertThat(RomanNumeral.X.applyTo(4), is(14));
    }

}