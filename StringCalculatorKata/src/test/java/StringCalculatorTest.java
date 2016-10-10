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

    private void addStringNumbers(String... s) {
        for (String numberString : s) {
            stringCalculator.add(numberString);
        }
        result = stringCalculator.getResult();
    }

    @Test
    public void testStringOfOneReturnsOne() {
        addStringNumbers("1");
        assertThat(result, is(1));
    }

    @Test
    public void testStringTwoZerosReturnsZero() {
        addStringNumbers("", "");
        assertThat(result, is(0));
    }

    @Test
    public void testStringZeroTwoThreeReturnsFive() {
        addStringNumbers("", "2", "3");
        assertThat(result, is(5));
    }

    @Test
    public void testStringZeroAndOneTwoThreeReturnsSix() {
        addStringNumbers(",1", "2", "3");
        assertThat(result, is(6));
    }

    //Have issues with my backslash so ammending the delimiter.
    @Test
    public void testNewLineDelimiterAndEmptyStringReturnsZero() {
        addStringNumbers(".n0");
        assertThat(result, is(0));
    }

    @Test
    public void testNewLineDelimiterAndCommasSeperatedSumForFivePlusFourReturnsNine() {
        addStringNumbers(".n5,4");
        assertThat(result, is(9));
    }

    @Test
    public void testNewLineDelimiterAndCommasWithMultipleArguementsForFivePlusFiveReturnsTen() {
        addStringNumbers(".n5", ",5");
        assertThat(result, is(10));
    }

    @Test
    public void testNewLineDelimiterSeperatedNumbersTwoThreeCommaFourReturnsNine() {
        addStringNumbers("2.n3,4");
        assertThat(result, is(9));
    }

    @Test
    public void testCustomDelimiterWithEmptyStringReturnsZero() {
        addStringNumbers("//;");
        assertThat(result, is(0));
    }
}