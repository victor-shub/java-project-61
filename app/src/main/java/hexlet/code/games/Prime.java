package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Engine;

public final class Prime implements Game {
    private int num;
    public static void play() {
        Prime game = new Prime();
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        final int primeBound = 1000;
        this.num = Even.getRandomNumber(primeBound);
        return "" + num;
    }
    public String getAnswer() {
        if (num % 2 == 0) {
            return "no";
        }
        final int startNum = 3;
        for (int i = startNum; i * i <= num; i += 2) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
