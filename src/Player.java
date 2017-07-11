import java.util.Scanner;

/**
 * Created by joyapuryear on 7/10/17.
 */
public abstract class Player {

    private String name;
    private Roshambo choice;

    public abstract Roshambo generateRoshambo();

    public String getName() {
        return name;
    }

    public Roshambo getChoice() {
        return choice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChoice(Roshambo choice) {
        this.choice = choice;
    }
}
