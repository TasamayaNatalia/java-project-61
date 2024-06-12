package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {
    public static void game() {

        String rules = "What number is missing in the progression?";
        String[][] questionsChecks = new String[Engine.ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int firstNumber = (int) (Math.random() * 100);
            final int difference = (int) (Math.random() * 10);
            final int missedNumber = (int) (Math.random() * 10);
            final int progressionLength = (int) (Math.random() * 10);

            String[] progression = makeProgression(firstNumber, difference, progressionLength);
            questionsCheck[1] = progression[missedNumber];
            progression[missedNumber] = "..";
            questionsCheck[0] = String.join(" ", progression);
        }
        Engine.engine(rules, questionsChecks);
    }
    public static String[] makeProgression(int firstNumber, int difference, int progressionLength) {
        String[] progression = new String[progressionLength];
        progression[0] = Integer.toString(progressionLength);
        var i = 0;
        var numberProgression = firstNumber;
        while (i < progressionLength) {
            numberProgression = numberProgression + difference;
            progression[i] = Integer.toString(numberProgression);
            i++;
        }
        return progression;
    }
}

