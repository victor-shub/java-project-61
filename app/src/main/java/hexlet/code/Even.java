package hexlet.code;

import java.util.Random;

class Even implements Game {
    private String question;
    private String answer;
    static void play() {
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
        this.question = "" + getRandomNumber();
        return question;
    }
    public String questionToAnswer(String question) {
        var num = Integer.parseInt(question);
        if (num % 2 == 0) {
            this.answer = "yes";
        } else {
            this.answer = "no";
        }
        return answer;
    }
}
