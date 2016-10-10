/**
 * Created by DreamShine on 10/10/2016.
 */
public class FizzBuzz {

    public static String getFizzBuzzString(int n) {
        String fizzBuzzString = "";
        if (n > 0) {
            if (n % 15 == 0) return "fizzbuzz";
            if (n % 3 == 0) return "fizz";
            if (n % 5 == 0) return "buzz";
            else
                return Integer.toString(n);
        }
        return fizzBuzzString;
    }
}
