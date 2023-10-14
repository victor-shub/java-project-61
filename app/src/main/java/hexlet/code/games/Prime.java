package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Engine;

public class Prime implements Game {
    private int num;
    public static void play() {
        Prime game = new Prime();
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        this.num = Even.getRandomNumber(1000);
        return "" + num;
    }
    public String getAnswer() {
        if (num % 2 == 0) {
            return "no";
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
