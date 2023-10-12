package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Engine;

public class Progression implements Game {
    public static void play() {
        Progression game = new Progression();
        var task = "What number is missing in the progression?";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        return null;
    }
    public String getAnswer() {
        return null;
    }
}
