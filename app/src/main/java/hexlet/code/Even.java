package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenstarting() {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        System.out.println("Question: " + number);

        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);

        for (int i = 0; i < 3; i++) {

            if (number % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
                break;
            } else if (number % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
                break;
            } else if (number % 2 != 0 && userAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + userName);
            } else if (number % 2 == 0 && userAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, " + userName);
            } else
                System.out.println("error");

            //userAnswer " is wrong answer ;(. Correct answer was 'no'.""

        }
        scanner.close();//System.out.println(answer);
    }
}

