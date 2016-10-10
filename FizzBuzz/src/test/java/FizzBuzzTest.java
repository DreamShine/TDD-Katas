import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by DreamShine on 10/10/2016.
 */
public class FizzBuzzTest {
    private static final String EMPTY = "";

    @Test
    public void zero_returns_empty_string() {
        assertThat(FizzBuzz.getFizzBuzzString(0), is(EMPTY));
    }

    @Test
    public void one_returns_itself() {
        assertThat(FizzBuzz.getFizzBuzzString(1), is("1"));
    }

    @Test
    public void two_returns_itself() {
        assertThat(FizzBuzz.getFizzBuzzString(2), is("2"));
    }

    @Test
    public void three_returns_fizz() {
        assertThat(FizzBuzz.getFizzBuzzString(3), is("fizz"));
    }

    @Test
    public void four_returns_four() {
        assertThat(FizzBuzz.getFizzBuzzString(4), is("4"));
    }

    @Test
    public void five_returns_buzz() {
        assertThat(FizzBuzz.getFizzBuzzString(5), is("buzz"));
    }

    @Test
    public void nine_returns_fizz() {
        assertThat(FizzBuzz.getFizzBuzzString(9), is("fizz"));
    }

    @Test
    public void fifteen_returns_fizzbuzz() {
        assertThat(FizzBuzz.getFizzBuzzString(15), is("fizzbuzz"));
    }

    @Test
    public void thirty_returns_fizzbuzz() {
        assertThat(FizzBuzz.getFizzBuzzString(30), is("fizzbuzz"));
    }
}