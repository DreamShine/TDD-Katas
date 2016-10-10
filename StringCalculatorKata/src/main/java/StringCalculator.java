import java.util.Arrays;
import java.util.List;

/**
 * Created by DreamShine on 09/10/2016.
 */
public class StringCalculator {
    private int result;
    private List<String> stringList;

    public void add(String s) throws NumberFormatException {

        s = s.replaceAll(".n", ",");
        stringList = Arrays.asList(s.split(","));

        for (String stringNumber : stringList) {
            if ("".equals(stringNumber)) {
                stringNumber = "0";
            }
            result += Integer.parseInt(stringNumber);
        }
    }

    public int getResult() {
        return result;
    }
}
