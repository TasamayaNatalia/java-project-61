package hexlet.code;
import static hexlet.code.Cli.greeting;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int greet = 1;
        int gameEven = 2;
        int gameCalc = 3;
        int gameGcd = 4;
        int gameProgression = 5;
        int gamePrime = 6;


        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Your choice: " + number);
        if (number == greet) {
            greeting();
        } else if (number == gameEven) {
            Even.game();
        } else if (number == gameCalc) {
            Calc.game();
        } else if (number == gameGcd) {
            GCD.game();
        } else if (number == gameProgression) {
            Progression.game();
        } else if (number == gamePrime) {
            Prime.game();
        }
    }
}
