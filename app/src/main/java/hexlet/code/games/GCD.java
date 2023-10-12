package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Engine;

public class GCD implements Game {
    public static void play() {
        GCD game = new GCD();
        var task = "Find the greatest common divisor of given numbers.";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        return null;
    }
    public String getAnswer() {
        return null;
    }
}
