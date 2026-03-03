import java.util.Scanner;

public class guessGame {

    public static void main(String[] args) {

        double finalAnswer = Math.floor(Math.random() * 100);
        System.out.println("Answer is: " + finalAnswer);

        Scanner scanner = new Scanner(System.in);

        double finalGuess = 0;


        for (int i = 0; i < 4; i++) {

            System.out.println("Enter guess " + (i + 1) + ": ");
            double guess = scanner.nextDouble();

            finalGuess = guess;

            if (guess > finalAnswer) {
                System.out.println("TOO HIGH");
            } else if (guess < finalAnswer) {
                System.out.println("TOO LOW");
            } else {
                System.out.println("CORRECT");
            }
        }

        double[] finalGuessList = new double[1];
        finalGuessList[0] = finalGuess;

        double score = Math.abs(finalGuess - finalAnswer);

        System.out.println("Score difference: " + score);

        double[] averageScoreList = new double[3];



                }
            }
