import java.util.Scanner;

/**
 * Created by joyapuryear on 7/10/17.
 */
public class RoshamboApp2 {
    public static void main(String[] args) {
        String choice = "y";
        String userChoice = "";
        String userName = "";
        Scanner scan = new Scanner(System.in);

        Player rockPlayer = new RockPlayer();
        Player randomPlayer = new RandomPlayer();
        Player player = new HumanPlayer();

        userName = getUserName(scan, player);

        do {

            userChoice = getOpponent(scan);

            //validation
            while (!userChoice.equalsIgnoreCase("R1") && !userChoice.equalsIgnoreCase("R2")) {
                System.out.println("Invalid Input! Please hit enter to input a valid input");
                scan.nextLine();
                userChoice = getOpponent(scan);
            }


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
                    System.out.println(player.getName() + " " + "loses!");
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    System.out.println(player.getName() + " " + "wins!");
                }

            } else if (userChoice.equalsIgnoreCase("R2")) {
                //do random player code
                System.out.println("Player 2: " + randomChoice);
                System.out.println(player.getName() + ": " + playerSelection);
                if (playerSelection.equals(randomChoice)) {
                    System.out.println("Draw!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    if (randomChoice.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(player.getName() + " loses!");
                    } else {//paper
                        System.out.println(player.getName() + " wins!");
                    }
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    if (randomChoice.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(player.getName() + " wins!");
                    } else {//scissors
                        System.out.println(player.getName() + " loses!");
                    }
                } else if (playerSelection.toString().equalsIgnoreCase("Rock")) {
                    if (randomChoice.toString().equalsIgnoreCase("Scissors")) {
                        System.out.println(player.getName() + " loses!");
                    } else {//paper
                        System.out.println(player.getName() + " wins!");
                    }
                }

            }


            System.out.println("Would you like to play again? (y/n)");
            choice = scan.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");

    }

    private static String getOpponent(Scanner scan) {
        String userChoice;
        System.out.println("Would you like to play against RockPlayer R1 or RandomPlayer R2?: (R1/R2) ");
        userChoice = scan.nextLine();
        return userChoice;
    }

    private static String getUserName(Scanner scan, Player player) {
        String userName;
        System.out.println("Welcome to the Rock, Paper Scissors App!");
        System.out.println();
        System.out.println("Enter your name: ");
        userName = scan.nextLine();
        player.setName(userName);
        return userName;
    }

}