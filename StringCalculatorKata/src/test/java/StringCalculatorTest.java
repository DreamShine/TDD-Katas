import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by DreamShine on 09/10/2016.
 */
public class StringCalculatorTest {

    private StringCalculator stringCalculator;
    private int result;

    @Before
    public void setUp() throws Exception {
        stringCalculator = new StringCalculator();
        result = 0;
    }

    @Test
    public void emptyStringReturnsZero() {
        addStringNumbers("");
        assertThat(result, is(0));
    }

    private int addStringNumbers(String s) {
        return stringCalculator.add(s);
    }

    @Test
    public void testStringOfOneReturnsOne() {
        addStringNumbers("1");
        assertThat(result, is(1));
    }

}