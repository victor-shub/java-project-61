package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression {
    public static void play() {
        var task = "What number is missing in the progression?";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }

    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        final int seqLength = 10;
        final int firstNumBound = 100;
        final int stepBound = 10;
        var skippedSeqNum = 0;
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int[] seqNums = generateRandomProgression(seqLength, firstNumBound, stepBound);
            var skipNum = Even.generateRandomNumber(seqLength);
            var question = new StringBuilder();
            for (var j = 0; j < seqLength; j++) {
                if (j == skipNum) {
                    question.append(".. ");
                    skippedSeqNum = seqNums[j];
                } else {
                    question.append(seqNums[j]);
                    question.append(" ");
                }
            }
            questionsAndAnswers[0][i] = question.toString();
            questionsAndAnswers[1][i] = "" + skippedSeqNum;
        }
        return questionsAndAnswers;
    }
    static int[] generateRandomProgression(int seqLength, int firstNumBound, int stepBound) {
        int[] progression = new int[seqLength];
        var seqNum = Even.generateRandomNumber(firstNumBound);
        var stepNum = Even.generateRandomNumber(stepBound);
        for (var i = 0; i < seqLength; i++) {
            progression[i] = seqNum;
            seqNum += stepNum;
        }
        return progression;
    }
}
