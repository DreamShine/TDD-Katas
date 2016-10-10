import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by DreamShine on 09/10/2016.
 */
public class PrimeFactorsTest {
    @Test
    public void one_has_no_prime_factors() {
        assertThat(PrimeFactors.computePrimeFactorsOf(1), is(Collections.<Integer>emptyList()));
    }

    @Test
    public void two_has_only_itself_as_a_prime_factor() {
        assertThat(PrimeFactors.computePrimeFactorsOf(2), is(asList(2)));
    }

    @Test
    public void three_has_only_itself_as_a_prime_factor() {
        assertThat(PrimeFactors.computePrimeFactorsOf(3), is(asList(3)));
    }

    @Test
    public void four_has_two_two_as_prime_factors() {
        assertThat(PrimeFactors.computePrimeFactorsOf(4), is(asList(2, 2)));
    }

    @Test
    public void five_has_only_itself_as_a_prime_factor() {
        assertThat(PrimeFactors.computePrimeFactorsOf(5), is(asList(5)));
    }

    @Test
    public void six_has_three_two_as_prime_factors() {
        assertThat(PrimeFactors.computePrimeFactorsOf(6), is(asList(2, 3)));
    }

    @Test
    public void eight_has_two_two_two_as_prime_factors() {
        assertThat(PrimeFactors.computePrimeFactorsOf(8), is(asList(2, 2, 2)));
    }

    @Test
    public void nine_has_three_three_as_prime_factors() {
        assertThat(PrimeFactors.computePrimeFactorsOf(9), is(asList(3, 3)));
    }
}