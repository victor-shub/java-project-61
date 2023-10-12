package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Engine;

public class Prime implements Game {
    public static void play() {
        Prime game = new Prime();
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        return null;
    }
    public String getAnswer() {
        return null;
    }
}
