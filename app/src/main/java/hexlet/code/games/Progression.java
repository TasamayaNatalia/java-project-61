package hexlet.code.games;
import java.util.Random;
import java.util.Arrays;

import hexlet.code.Engine;

public class Progression {
    public static void game() {

        String rules = "What number is missing in the progression?";
        String[][] questionsChecks = new String[Engine.ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int firstNumber = (int) (Math.random() * 100);
            final int difference = (int) (Math.random() * 10);
            final int progressionLength = (int) (Math.random() * 10) + 5;
            final int missedNumber = new Random().nextInt(progressionLength);
            System.out.println(firstNumber);
            System.out.println(difference);
            System.out.println(progressionLength);
            System.out.println(missedNumber);

            String[] progression = makeProgression(firstNumber, difference, progressionLength);
            questionsCheck[1] = progression[missedNumber];
            progression[missedNumber] = "..";
            questionsCheck[0] = String.join(" ", progression);
            System.out.println(Arrays.toString(questionsChecks));
        }
        Engine.engine(rules, questionsChecks);
    }

    public static String[] makeProgression(int firstNumber, int difference, int progressionLength) {
        String[] progression = new String[progressionLength];
        progression[0] = Integer.toString(firstNumber);
        var i = 1;
        var numberProgression = firstNumber;
        while (i < progressionLength) {
            numberProgression = numberProgression + difference;
            progression[i] = Integer.toString(numberProgression);
            i++;
        }
        return progression;
    }
}

