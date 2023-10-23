package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomInt(int lowBound, int highBound) {
        Random r = new Random();
        var num = r.nextInt(highBound - lowBound) + lowBound;
        return num;
    }

    public static String booleanToYesOrNo(boolean value) {
        if (value) {
            return "yes";
        }
        return "no";
    }
}
