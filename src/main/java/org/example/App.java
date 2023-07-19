package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String [] args) {


        Scanner scanner = new Scanner(System.in);
        Integer userInput = 0;
        while (userInput != 1) {
            System.out.println("Enter year A.D to find corresponding year in other religions, press 1 to quit: ");
            userInput = Integer.valueOf(scanner.nextLine());
            int year = userInput;
            System.out.println("Assyrian, Hebrew, Chinese, Julian, Buddhist, Gregorian, Hindu, Islamic, Persian, (French) Revolutionary");
            String unit = scanner.nextLine();

            if (unit.equals("Assyrian")) {
                userInput = userInput + 4748;
                System.out.println("The Assyrian year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("Hebrew")) {
                userInput = userInput + 3760;
                System.out.println("The Hebrew year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("Chinese")) {
                userInput = userInput + 2697;
                System.out.println("The Chinese year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("Julian")) {
                userInput = userInput + 753;
                System.out.println("The Julian year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("Buddhist")) {
                userInput = userInput + 540;
                System.out.println("The Buddhist year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("Gregorian")) {
                userInput = userInput;
                System.out.println("Gregorian year is " + userInput + ".");
            }
            if (unit.equals("Hindu")) {
                userInput = userInput - 79;
                System.out.println("The Hindu year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("Islamic")) {
                userInput = userInput - 579;
                System.out.println("The Islamic year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("Persian")) {
                userInput = userInput - 622;
                System.out.println("The Persian year in " + year + " is " + userInput + ".");
            }
            if (unit.equals("French")) {
                userInput = userInput - 1793;
                System.out.println("The French Revolutionary year in " + year + " is " + userInput + ".");
            }


        }
    }
}
