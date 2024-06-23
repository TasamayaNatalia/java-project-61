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
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Your choice: " + number);
        if(number == 1){
            greeting();
        } else if (number == 2) {
            Even.game();
        } else if (number == 3) {
            Calc.game();
        } else if (number == 4) {
            GCD.game();
        } else if (number == 5) {
            Progression.game();
        } else if (number == 6) {
            Prime.game();
        }
    }
}
