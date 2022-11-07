import java.util.Objects;

public class SmurfFactory {

    public static void main(String[] args) {

        Smurf.CreateSmurf("Handy");
        Smurf.CreateSmurf("Papa");
        Smurf.CreateSmurf("Papa");
        Smurf.CreateSmurf("Smurfette");
        Smurf.CreateSmurf("Smurfette");
        Objects.requireNonNull(Smurf.CreateSmurf("Clumsy")).printName();
        Objects.requireNonNull(Smurf.CreateSmurf("Brainy")).eat();
    }
}
