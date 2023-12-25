package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.greeting;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n" +
                "0 - Exit");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Your choice: " + number);
        if(number == 1){
            greeting();
        }

    }
}
