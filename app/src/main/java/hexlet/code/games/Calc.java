package hexlet.code.games;
import hexlet.code.Engine;


public class Calc {

    public static void game() {

        String rules = "What is the result of the expression?";

        String[][] questionsChecks = new String[Engine.ROUNDS][2];


        for (var questionsCheck : questionsChecks) {
            final int firstNumber = (int) (Math.random() * 100);
            final int secondNumber = (int) (Math.random() * 100);
            final int numberOfOperator = (int) (Math.random() * 3);

            String[] operators = {" + ", " - ", " * "};
            questionsCheck[0] = (firstNumber + " " + operators[numberOfOperator] + " " + secondNumber);
            questionsCheck[1] = Integer.toString(calc(firstNumber, secondNumber, operators[numberOfOperator]));
        }

        Engine.engine(rules, questionsChecks);
    }

    public static int calc(int firstNumber, int secondNumber, String operator) {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new Error("Unknown operator!");
        };
    }

}

