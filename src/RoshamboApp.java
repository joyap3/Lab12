import java.util.Scanner;

/**
 * Created by joyapuryear on 7/10/17.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        String choice = "y";
        String userChoice = "";
        String userName = "";
        Scanner scan = new Scanner(System.in);

        RockPlayer rockPlayer = new RockPlayer();
        RandomPlayer randomPlayer = new RandomPlayer();
        HumanPlayer player = new HumanPlayer();

        do {
            System.out.println("Welcome to the Rock, Paper Scissors App!");
            System.out.println();
            System.out.println("Enter your name: ");
            userName = scan.nextLine();
            player.setName(userName);

            System.out.println("Would you like to play against RockPlayer R1 or RandomPlayer R2?: (R1/R2) ");
            userChoice = scan.nextLine();


            Roshambo rockChoice = rockPlayer.generateRoshambo();
            Roshambo randomChoice = randomPlayer.generateRoshambo();
            Roshambo playerSelection = player.generateRoshambo();

            if (userChoice.equalsIgnoreCase("R1")) {
                //do rock player code
                System.out.println("Player 1: " + rockChoice);
                System.out.println(player.getName() + ": " + playerSelection);

                if (playerSelection.equals(rockChoice)) {
                    System.out.println("Draw!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    System.out.println(userName + "loses!");
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    System.out.println(userName + "wins!");
                }

            } else if (userChoice.equalsIgnoreCase("R2")) {
                //do random player code
                System.out.println("Player 2: " + randomChoice);
                System.out.println(userName + ": " + playerSelection);
                if (playerSelection.equals(randomChoice)) {
                    System.out.println("Draw!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    if (randomChoice.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " loses!");
                    } else {//paper
                        System.out.println(userName + " wins!");
                    }
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    if (randomChoice.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " wins!");
                    } else {//scissors
                        System.out.println(userName + " loses!");
                    }
                }else if (playerSelection.toString().equalsIgnoreCase("Rock")) {
                    if (randomChoice.toString().equalsIgnoreCase("Scissors")) {
                        System.out.println(userName + " loses!");
                    } else {//paper
                        System.out.println(userName + " wins!");
                    }
                }

            }


            System.out.println("Would you like to play again? (y/n)");
            choice = scan.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");

    }

}