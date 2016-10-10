/**
 * Created by DreamShine on 10/10/2016.
 */
public class BerlinClock {
    public static String getIndividualMinutesFor(String s) {
        String minutes = "";
        String minutesAsLights = "";
        if (!"".equals(s)) {
            minutes = s.substring(1);
            minutesAsLights = printIndividualMinuteLights(minutes, minutesAsLights);
        }
        return minutesAsLights;
    }

    private static String printIndividualMinuteLights(String minutes, String minutesAsLights) {

        for (int i = Integer.parseInt(minutes) % 5; i > 0; i--) {
            minutesAsLights += "Y";
        }
        while (minutesAsLights.length() != 4) {
            minutesAsLights += "-";
        }
        return minutesAsLights;
    }
}
