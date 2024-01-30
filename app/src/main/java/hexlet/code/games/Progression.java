package hexlet.code.games;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Progression {
    public static void completing() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");


        while (count < 3) {
            int[] numbers = new int[10];
            String result = "";

            int firstNumber = (int) (Math.random() * 100);
            int difference = (int) (Math.random() * 10);
            int missedNumber = (int) (Math.random() * 10);

            numbers[0] = firstNumber;
            //System.out.println("Question: " + firstNumber + " " + secondNumber);
            for (int i = 0; i < numbers.length; i++) {
                if (i == missedNumber) {
                    numbers[i] = 0;
                    result += ".. ";
                } else {
                    numbers[i] = firstNumber + (i * difference);
                    result += numbers[i] + " ";
                }
            }

            System.out.println("Question: " + result.trim());

            int userAnswer = scanner.nextInt();

            int correctAnswer = firstNumber + (missedNumber * difference);

            if (correctAnswer == userAnswer) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("Question: " + result + "\nYour answer: " + userAnswer + "\n" + userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".\nLet's try again, " + userName + "!");
                break;
            }

            if (count == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}


