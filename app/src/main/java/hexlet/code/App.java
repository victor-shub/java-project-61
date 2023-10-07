package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scannedNumber = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String selectedNumber = scannedNumber.next();
        switch (selectedNumber) {
            case "1":
                Cli.Greet();
                scannedNumber.close();
                break;
            case "0":
                scannedNumber.close();
                break;
        }
    }
}
