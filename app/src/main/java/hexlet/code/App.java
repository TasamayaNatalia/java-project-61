package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Calc.calculate;
import static hexlet.code.Cli.greeting;
import static hexlet.code.Even.evenstarting;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Your choice: " + number);
        if(number == 1){
            greeting();
        } else if (number == 2) {
            evenstarting();
        } else if (number == 3) {
            calculate();
        }

    }
}
