package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenstarting() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        while (count < 3) {
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);

            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            if (number % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
                count = count + 1;
            } else if (number % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
                count = count + 1;
            } else if (number % 2 != 0 && userAnswer.equals("yes")) {
                System.out.println("'yes' is the wrong answer ;(. The correct answer was 'no'.\nLet's try again, " + userName);
            } else if (number % 2 == 0 && userAnswer.equals("no")) {
                System.out.println("'no' is the wrong answer ;(. The correct answer was 'yes'.\nLet's try again, " + userName);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                userAnswer = scanner.next();
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
