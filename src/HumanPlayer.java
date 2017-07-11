import java.util.Scanner;

/**
 * Created by joyapuryear on 7/10/17.
 */
public class HumanPlayer extends Player {

    Scanner scan = new Scanner(System.in);

    @Override
    public Roshambo generateRoshambo (){
        System.out.println("Please select Rock, Paper, or Scissors: (R/P/S): ");
        String userInput = scan.nextLine();
        Roshambo choice = null;
        //add validation later
        System.out.println();

       if (userInput.equalsIgnoreCase("r")){
            choice = Roshambo.ROCK;
        }
         else if (userInput.equalsIgnoreCase("p")){
            choice = Roshambo.PAPER;
        }
        else if (userInput.equalsIgnoreCase("s")){
                    choice = Roshambo.SCISSORS;
        }
           return choice;
        }

    }



