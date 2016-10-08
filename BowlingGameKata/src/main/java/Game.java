/**
 * Created by DreamShine on 08/10/2016.
 */
public class Game {
    private int score;
    private int counter = 0;
    private int[] rolls = new int[21];

    public void roll(int... rolls) {
        for (int pinsDowned : rolls) {
            roll(pinsDowned);
        }
    }

    public void roll(int pinsKnockedDown) {
        rolls[counter++] = pinsKnockedDown;
    }

    public int score() {

        int score = 0;
        int currentFrame = 0;

        for (int i = 0; i < 10; i++) {
            if (isStrike(currentFrame)) {
                score += 10 + rolls[currentFrame + 1] + rolls[currentFrame + 2];
                currentFrame++;
            } else if (isSpare(currentFrame)) {
                score += 10 + rolls[currentFrame + 2];
                currentFrame += 2;
            } else {
                score += rolls[currentFrame] + rolls[currentFrame + 1];
                currentFrame += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int currentFrame) {
        return rolls[currentFrame] == 10;
    }

    private boolean isSpare(int currentFrame) {
        return rolls[currentFrame] + rolls[currentFrame + 1] == 10;
    }

    public int getRoll() {
        return counter;
    }
}
