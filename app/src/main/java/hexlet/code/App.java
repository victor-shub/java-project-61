package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

class App {
    public static void main(String[] args) {
        Scanner scannedNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String selectedNumber = scannedNumber.next();
        switch (selectedNumber) {
            case "0":
                break;
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.play();
                break;
            case "3":
                Calc.play();
                break;
            case "4":
                GCD.play();
                break;
            case "5":
                Progression.play();
                break;
            default:
                System.out.println("You chose something strange. Try again another time. Goodbye!");
        }
        scannedNumber.close();
    }
}
