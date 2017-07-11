/**
 * Created by joyapuryear on 7/10/17.
 */
public enum Roshambo {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");


    private String anyName;

    Roshambo(String anyName) {
        this.anyName = anyName;
    }


    @Override
    public String toString() {
        //conditional statement based on userInput
        return anyName;
    }
}
