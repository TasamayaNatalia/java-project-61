package hexlet.code.games;
import hexlet.code.Engine;



public class GCD {
    public static void game() {

        String rules = "Find the greatest common divisor of given numbers.";
        String[][] questionsChecks = new String[Engine.ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int firstNumber = (int) (Math.random() * 100);
            final int secondNumber = (int) (Math.random() * 100);
            questionsCheck[0] = firstNumber + " " + secondNumber;
            questionsCheck[1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.engine(rules, questionsChecks);
    }

    private static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        return firstNumber + secondNumber;
    }
}