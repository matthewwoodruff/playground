package roman;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static roman.RomanNumeralOne.one;

public class RomanNumeralOneTest {

    @Test
    public void oneCanBeAppliedToZeroToTwo() throws Exception {
        assertThat(one().canApplyTo(0), is(true));
        assertThat(one().canApplyTo(1), is(true));
        assertThat(one().canApplyTo(2), is(true));
    }

    @Test
    public void oneCannotBeAppliedToThreeOrFour() throws Exception {
        assertThat(one().canApplyTo(3), is(false));
        assertThat(one().canApplyTo(4), is(false));
    }

    @Test
    public void oneCanBeAppliedToFive() throws Exception {
        assertThat(one().canApplyTo(5), is(true));
    }

    @Test
    public void oneCannotBeAppliedToSixToNine() throws Exception {
        assertThat(one().canApplyTo(6), is(false));
        assertThat(one().canApplyTo(7), is(false));
        assertThat(one().canApplyTo(8), is(false));
        assertThat(one().canApplyTo(9), is(false));
    }

    @Test
    public void oneCanBeAppliedToTen() throws Exception {
        assertThat(one().canApplyTo(10), is(true));
    }

    @Test
    public void oneCannotBeAppliedToElevenOrGreater() throws Exception {
        assertThat(one().canApplyTo(11), is(false));
        assertThat(one().canApplyTo(12), is(false));
        assertThat(one().canApplyTo(13), is(false));
        assertThat(one().canApplyTo(15), is(false));
        assertThat(one().canApplyTo(20), is(false));
    }

}