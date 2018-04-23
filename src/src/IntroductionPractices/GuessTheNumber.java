package IntroductionPractices;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        //do {
        JavaApp.guessTheNumber();
        //}while (tryAgain());
    }

    public static void guessTheNumber() {

        int a = 3;
        Random generator = new Random();
        final int random = generator.nextInt(10) + 1;
        System.out.println("I'm thinking on a number. Can you guess it? Introduce a Number");

        //do {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();

            if (value == random) {
                System.out.println("Correct");
                break;
            } else if (value > random) {
                System.out.println("The Number is Smaller");
                //a = --a;
            } else {
                System.out.println("The Number is Greater");
                //a = --a;
            }
            System.out.println("You have " + i + " tries");
        }
        //} while (a > 0);

        System.out.println("The number is " + random);

        JavaApp.tryAgain();
    }

    public static void tryAgain() {
        Scanner keyboard = new Scanner(System.in);
        String text;
        System.out.println("Want to play again? If Yes type: (y) If not type: (n)");
        text = keyboard.nextLine();
        if (text.equals("y")) {
            guessTheNumber();
        } else {
            System.out.println("Adiós");
            System.exit(0);
        }
    }
}
