package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void engine(String rules, String[][] questionsChecks) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (var questionsCheck : questionsChecks) {
            System.out.println("Question: " + questionsCheck[0]);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (userAnswer.equals(questionsCheck[1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf(userAnswer + " is wrong answer ;(. "
                        + "Correct answer was" + questionsCheck[1]
                        + ".\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
