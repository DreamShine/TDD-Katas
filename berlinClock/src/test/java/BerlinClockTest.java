import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by DreamShine on 10/10/2016.
 */
public class BerlinClockTest {
    @Test
    public void a_time_of_empty_string_has_no_individual_minute_lights_on() {
        assertThat(BerlinClock.getIndividualMinutesFor(""), is(""));
    }

    @Test
    public void time_of_HH_MM_00_has_no_individual_minute_lights_on() {
        assertThat(BerlinClock.getIndividualMinutesFor("00"), is("----"));
    }

    @Test
    public void time_of_HH_MM_01_has_one_individual_minute_light_on() {
        assertThat(BerlinClock.getIndividualMinutesFor("01"), is("Y---"));
    }

    @Test
    public void time_of_HH_MM_05_has_no_individual_minute_light_on() {
        assertThat(BerlinClock.getIndividualMinutesFor("05"), is("----"));
    }

    @Test
    public void time_of_HH_MM_16_has_one_individual_minute_light_on() {
        assertThat(BerlinClock.getIndividualMinutesFor("16"), is("Y---"));
    }


}