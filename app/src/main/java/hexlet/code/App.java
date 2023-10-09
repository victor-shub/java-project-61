package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scannedNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
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
            default:
                System.out.println("You chose something strange. Try again another time. Goodbye!");
        }
        scannedNumber.close();
    }
}
