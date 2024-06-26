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
            String operator = operators[numberOfOperator];

            questionsCheck[0] = firstNumber + operator + secondNumber;
            questionsCheck[1] = calc(firstNumber, secondNumber, operator);
        }

        Engine.engine(rules, questionsChecks);
    }

    public static String calc(int firstNumber, int secondNumber, String operator) {
        return switch (operator) {
            case " * " -> Integer.toString(firstNumber * secondNumber);
            case " - " -> Integer.toString(firstNumber - secondNumber);
            case " + " -> Integer.toString(firstNumber + secondNumber);
            default -> null;
        };
    }
}

