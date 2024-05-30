package hexlet.code.games;
import hexlet.code.Engine;


public class Even {
    public static void game() {

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsChecks = new String[Engine.ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int number = (int) (Math.random() * 100);
            questionsCheck[0] = Integer.toString(number);
            questionsCheck[1] = ((number % 2) == 0) ? "yes" : "no";
        }
        Engine.engine(rules, questionsChecks);
    }
}
