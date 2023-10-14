package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Engine;

public final class Progression implements Game {
    private int skippedSeqNum;
    public static void play() {
        Progression game = new Progression();
        var task = "What number is missing in the progression?";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        var seqLength = 10;
        var seqNum = Even.getRandomNumber(100);
        var stepNum = Even.getRandomNumber(10);
        var skipNum = Even.getRandomNumber(seqLength);
        var question = new StringBuilder();
        for (var i = 0; i < seqLength; i++) {
            if (i == skipNum) {
                question.append(".. ");
                this.skippedSeqNum = seqNum;
            } else {
                question.append(seqNum);
                question.append(" ");
            }
            seqNum += stepNum;
        }
        return question.toString();
    }
    public String getAnswer() {
        return "" + skippedSeqNum;
    }
}
