package hexlet.code.games;

import java.util.Random;
import hexlet.code.Game;
import hexlet.code.Engine;

public final class Even implements Game {
    private int number;
    public static void play() {
        Even game = new Even();
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.getGameBody(game, task);
    }
    static int getRandomNumber(int bound) {
        Random r = new Random();
        var num = r.nextInt(bound);
        return num;
    }
    public String getQuestion() {
        final int evenBound = 1000;
        this.number = getRandomNumber(evenBound);
        var question = "" + number;
        return question;
    }
    public String getAnswer() {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
