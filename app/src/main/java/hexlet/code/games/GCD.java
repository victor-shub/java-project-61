package hexlet.code.games;

import java.math.BigInteger;
import hexlet.code.Game;
import hexlet.code.Engine;

public class GCD implements Game {
    private int firstNum;
    private int secondNum;
    public static void play() {
        GCD game = new GCD();
        var task = "Find the greatest common divisor of given numbers.";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        this.firstNum = Even.getRandomNumber(1000);
        this.secondNum = Even.getRandomNumber(1000);
        var question = firstNum + " " + secondNum;
        return question;
    }
    public String getAnswer() {
        var b1 = BigInteger.valueOf(firstNum);
        var b2 = BigInteger.valueOf(secondNum);
        var gcd = b1.gcd(b2);
        return "" + gcd.intValue();
    }
}
