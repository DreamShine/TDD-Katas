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
        game.roll(0);
        assertThat(game.getScore(), is(0));
    }
}