/**
 * Created by joyapuryear on 7/10/17.
 */
public class RandomPlayer extends Player {
    @Override
    public Roshambo generateRoshambo() {
        int randomNum = (int) (Math.random() * 2);
        switch (randomNum) {
            case (0):
                return Roshambo.ROCK;
            case (1):
                return Roshambo.PAPER;
            case (2):
                return Roshambo.SCISSORS;
            default:
                System.out.println("Error with switch logic!");
                break;
        }
        return null;

    }

}
