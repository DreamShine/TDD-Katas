import java.util.Arrays;
import java.util.List;

/**
 * Created by DreamShine on 09/10/2016.
 */
public class StringCalculator {
    private int result;
    private List<String> stringList;

    public void add(String numberString) throws NumberFormatException {

        String customDelimiter = ",";
        if (isUsingCustomDelimiter(numberString)) {
            customDelimiter = getCustomDelimiter(numberString);
            numberString = numberString.substring(2);
        }

        numberString = numberString.replaceAll(".n", customDelimiter);
        stringList = Arrays.asList(numberString.split(customDelimiter));

        for (String stringNumber : stringList) {
            if ("".equals(stringNumber)) {
                stringNumber = "0";
            }
            result += Integer.parseInt(stringNumber);
        }
    }

    private String getCustomDelimiter(String numberString) {
        if (numberString.length() > 2)
            return Character.toString(numberString.charAt(2));
        else
            return ",";
    }

    private boolean isUsingCustomDelimiter(String s) {
        return s.startsWith("//");
    }

    public int getResult() {
        return result;
    }
}
