package hexlet.code;
import java.util.Scanner;
//import java.util.Random;
public class Calc {
    public static void calculate() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");


        while (count < 3) {
            int firstNumber = (int) (Math.random() * 10);
            int secondNumber = (int) (Math.random() * 10);
            char[] symbols = {'+', '-', '*'};
            int n = (int)Math.floor(Math.random() * symbols.length);
            char symbol = symbols[n];

            //int correctAnswer = firstNumber + symbol + secondNumber;
            int correctAnswer;
            if (symbol == '+') {
                correctAnswer = firstNumber + secondNumber;
            } else if (symbol == '-') {
                correctAnswer = firstNumber - secondNumber;
            } else {
                correctAnswer = firstNumber * secondNumber;
            }

            System.out.println("Question: " + firstNumber + " " + symbol + " " + secondNumber);

            int userAnswer = scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (correctAnswer == userAnswer) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("Question: " + firstNumber + symbol + secondNumber + "\nYour answer: " + userAnswer + "\n" + userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".\nLet's try again, " + userName + "!");
                break;
            }
            //count = count + 1;
            if (count == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}

