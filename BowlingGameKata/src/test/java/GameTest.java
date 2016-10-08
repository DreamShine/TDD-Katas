import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by DreamShine on 08/10/2016.
 */
public class GameTest {
    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void TestGutterGameScoresZero() throws Exception {
        game.roll(0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void TestThrowTwentyGutterBallsScoresZero() throws Exception {
        roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void TestThrowTwentyRollsOfOneScoresTwenty() throws Exception {

        roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void TestThrowSpareThenFourScoresEighteen() {
        //--Roll the rest as zeros. Spare calculated as 10 + next roll for a single frame.
        roll(4, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        assertThat(game.score(), is(18));
    }

    private void roll(int... rolls) {
        for (int pinsDowned : rolls) {
            game.roll(pinsDowned);
        }
    }

}