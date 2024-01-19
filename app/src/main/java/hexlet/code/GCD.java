package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static void findOfDivisor() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");


        while (count < 3) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + firstNumber + " " + secondNumber);

            int userAnswer = scanner.nextInt();

            int correctAnswer = gcd(firstNumber, secondNumber);

            if (correctAnswer == userAnswer) {
                System.out.println("Your answer: " + userAnswer);
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("Question: " + firstNumber + " " + secondNumber + "\nYour answer: " + userAnswer + "\n" + userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".\nLet's try again, " + userName + "!");
                break;
            }

            if (count == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}