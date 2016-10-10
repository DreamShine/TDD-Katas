import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by DreamShine on 09/10/2016.
 */
public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() throws Exception {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void emptyStringReturnsZero() {
        int result = stringCalculator.add("");
        assertThat(result, is(0));
    }

}