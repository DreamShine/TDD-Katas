import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by DreamShine on 08/10/2016.
 */
public class GameTest {
    @Test
    public void TestGutterGameScoresZero() throws Exception {
        Game game = new Game();
        game.roll(1, 0);
        assertThat(game.getScore(), is(0));
    }

    @Test
    public void TestThrowTwentyGutterBallsScoresZero() throws Exception {
        Game game = new Game();
        game.roll(20, 0);
        assertThat(game.getScore(), is(0));
    }

    @Test
    public void TestThrowTwentyRollsOfOneScoresTwenty() throws Exception {
        Game game = new Game();
        game.roll(20, 1);
        assertThat(game.getScore(), is(20));
    }

}