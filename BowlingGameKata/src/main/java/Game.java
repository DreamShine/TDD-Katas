/**
 * Created by DreamShine on 08/10/2016.
 */
public class Game {
    private int score;

    public void roll(int timesRolled, int pinsKnockedDown) {
        for (int i = 0; i < timesRolled; i++) {
            score += pinsKnockedDown;
        }
    }

    public int getScore() {
        return score;
    }

}
