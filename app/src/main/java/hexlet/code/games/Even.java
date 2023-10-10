package hexlet.code.games;

import java.util.Random;
import hexlet.code.Game;
import hexlet.code.Engine;

public class Even implements Game {
    public static void play() {
        Even game = new Even();
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.getGameBody(game, task);
    }
    static int getRandomNumber() {
        Random r = new Random();
        var num = r.nextInt(1000);
        return num;
    }
    public String getQuestion() {
        var question = "" + getRandomNumber();
        return question;
    }
    public String questionToAnswer(String question) {
        var num = Integer.parseInt(question);
        if (num % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
