package roman;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static roman.RomanNumeralFive.five;

public class RomanNumeralFiveTest {

    @Test
    public void fiveCanBeAppliedToZeroToThree() throws Exception {
        assertThat(five().canApplyTo(0), is(true));
        assertThat(five().canApplyTo(1), is(true));
        assertThat(five().canApplyTo(2), is(true));
        assertThat(five().canApplyTo(3), is(true));
    }

    @Test
    public void fiveCannotBeAppliedToFourOrGreater() throws Exception {
        assertThat(five().canApplyTo(4), is(false));
        assertThat(five().canApplyTo(5), is(false));
        assertThat(five().canApplyTo(6), is(false));
        assertThat(five().canApplyTo(7), is(false));
        assertThat(five().canApplyTo(8), is(false));
        assertThat(five().canApplyTo(9), is(false));
        assertThat(five().canApplyTo(10), is(false));
        assertThat(five().canApplyTo(11), is(false));
        assertThat(five().canApplyTo(15), is(false));
        assertThat(five().canApplyTo(20), is(false));
    }

}