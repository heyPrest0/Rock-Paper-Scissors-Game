import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors). Enter 'exit' to quit.");

        while (true) {
            System.out.print("Your choice: ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer's choice: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
