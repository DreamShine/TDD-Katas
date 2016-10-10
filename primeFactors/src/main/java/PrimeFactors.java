import java.util.ArrayList;
import java.util.List;

/**
 * Created by DreamShine on 10/10/2016.
 * Following Bob Martins Example of using a TDD approach to derive a
 * pretty nice algorithm for computing the prime factors of a number.
 * <p>
 * All credit for this example goes to Uncle Bob.
 */
public class PrimeFactors {
    public static List<Integer> computePrimeFactorsOf(int n) {

        List<Integer> factors = new ArrayList<Integer>();
        for (int candidate = 2; n > 1; candidate++) {
            for (; n % candidate == 0; n /= candidate) {
                factors.add(candidate);
            }
        }
        return factors;
    }
}
