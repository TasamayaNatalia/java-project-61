package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    public static void selectPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");


        while (count < 3) {
        int number = (int) (Math.random() * 100);
        System.out.println("Question: " + number);

        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);
            String correctAnswer = " ";

            //for (int i = 2; i * i <= number; i++) {
                //if (number % i == 0) {
                    //correctAnswer = "no";
                //}
            //}

            if (number <= 1 ) {
                correctAnswer = "no";
            }  else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        correctAnswer = "no";
                        break;
                    } else {
                        correctAnswer = "yes";
                    }
                }
            }

            //System.out.println("Question: " + number);

            //String userAnswer = scanner.next();
            //System.out.println("Your answer: " + userAnswer);
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
    }//"Question: " + number + "\nYour answer: " + userAnswer + "\n" +

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
