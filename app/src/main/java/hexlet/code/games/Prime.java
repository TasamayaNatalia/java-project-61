package hexlet.code.games;
import hexlet.code.Engine;


public class Prime {
    public static void game() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsChecks = new String[Engine.ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int number = (int) (Math.random() * 100);
            questionsCheck[0] = Integer.toString(number);
            questionsCheck[1] = isPrime(number) ? "yes" : "no";
        }
        Engine.engine(rules, questionsChecks);


    }
    public static boolean isPrime(int number) {
        if (number >= 2) {

            var i = 2;
            while (i < number) {
                if ((number % i) == 0) {
                    break;
                } else {
                    i++;
                }
            }
            return  (i == number);
        } else {
            return false;
        }
    }
}



