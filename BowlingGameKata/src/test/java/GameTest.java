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
        game.roll(0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void TestThrowTwentyRollsOfOneScoresTwenty() throws Exception {

        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertThat(game.score(), is(20));
    }

    @Test
    public void TestThrowSpareThenFourScoresForteen() {
        game.roll(4);
        game.roll(6);
        game.roll(4);
        //--Roll the rest as zeros
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertThat(game.score(), is(14));
    }
    
}