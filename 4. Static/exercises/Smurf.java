import java.util.ArrayList;
import java.util.List;

public class Smurf {

    private String name;
    public static List<String> existingSmurfs = new ArrayList<>();

    public static Smurf CreateSmurf(String name) {
        if (existingSmurfs.contains(name)) {
            if (name.equalsIgnoreCase("Papa"))
                System.out.printf("No! No! No! We only have one %s Smurf. \n", name);
            if (name.equalsIgnoreCase("Smurfette"))
                System.out.printf("No! No! No! We only have one %s. \n", name);
        }
        else {
            System.out.printf("Creating %s Smurf \n", name);
            existingSmurfs.add(name) ;
            return new Smurf(name);
        }

        return null;
    }

    public Smurf(String name) {
        this.name = name ;
    }

    public void printName() {
        System.out.printf("My name is %s Smurf. \n", name);
    }

    public void eat(){
        System.out.printf("%s Smurf is eating Smurfberries.", name);
    }
}
