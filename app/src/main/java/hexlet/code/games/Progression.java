package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression {
    public static void play() {
        final int progressionQuestionsCount = 3;
        var task = "What number is missing in the progression?";
        Engine.getGameBody(generateQuestionsAndAnswers(progressionQuestionsCount), task);
    }

    static String[][] generateQuestionsAndAnswers(int questionsCount) {
        String[][] questionsAndAnswers = new String[2][questionsCount];
        final int seqLength = 10;
        final int firstNumBound = 100;
        final int stepBound = 10;
        var skippedSeqNum = 0;
        for (var i = 0; i < questionsCount; i++) {
            var seqNum = Even.generateRandomNumber(firstNumBound);
            var stepNum = Even.generateRandomNumber(stepBound);
            var skipNum = Even.generateRandomNumber(seqLength);
            var question = new StringBuilder();
            for (var j = 0; j < seqLength; j++) {
                if (j == skipNum) {
                    question.append(".. ");
                    skippedSeqNum = seqNum;
                } else {
                    question.append(seqNum);
                    question.append(" ");
                }
                seqNum += stepNum;
            }
            questionsAndAnswers[0][i] = question.toString();
            questionsAndAnswers[1][i] = "" + skippedSeqNum;
        }
        return questionsAndAnswers;
    }
}
