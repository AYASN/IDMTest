import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeDurationTest {

    @Test
    public void should_return_zero_seconds_when_given_zero() throws BadBadValueException {
        String expected = "0s";

        String result = new TimeDuration(0).toString();

        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void should_return_12m_12s_when_given_732() throws BadBadValueException {
        String expected = "12m 12s";

        String result = new TimeDuration(732).toString();

        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void should_return_2h_0m_42s_when_given_7242() throws BadBadValueException {
        String expected = "2h 0m 42s";

        String result = new TimeDuration(7242).toString();

        assertThat(result).isEqualTo(expected);
    }




}