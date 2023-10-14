package hexlet.code.games;

import java.math.BigInteger;
import hexlet.code.Game;
import hexlet.code.Engine;

public final class GCD implements Game {
    private int firstNum;
    private int secondNum;
    public static void play() {
        GCD game = new GCD();
        var task = "Find the greatest common divisor of given numbers.";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        final int gcdBound = 1000;
        this.firstNum = Even.getRandomNumber(gcdBound);
        this.secondNum = Even.getRandomNumber(gcdBound);
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
