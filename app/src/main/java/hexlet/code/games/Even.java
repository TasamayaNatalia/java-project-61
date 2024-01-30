package hexlet.code.games;

import hexlet.code.Engine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Even {
    public static void evenstarting() {

        int number = (int) (Math.random() * 100);
        System.out.println("Question: " + number);

//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
//        String userName = scanner.next();
//        System.out.println("Hello, " + userName + "!");
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.startGame();



        while (Engine.count < 3) {


            String correctAnswer = " ";
            if(number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".\nLet's try again, " + userName + "!");
                break;
            }
            //count = count + 1;
            if (count == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
