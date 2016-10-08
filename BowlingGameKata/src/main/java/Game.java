/**
 * Created by DreamShine on 08/10/2016.
 */
public class Game {
    private int score;
    private int counter = 0;
    private int[] rolls = new int[21];

    public void roll(int pinsKnockedDown) {
        rolls[counter++] = pinsKnockedDown;
    }

    public int score() {
        int score = 0;
        int currentFrame = 0;
        for (int i = 0; i < 10; i++) {
            score += rolls[currentFrame] + rolls[currentFrame + 1];
            currentFrame += 2;
        }
        return score;
    }

    public int getRoll() {
        return counter;
    }
}
