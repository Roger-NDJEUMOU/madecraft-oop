public class Ocean {

    public static void main(String[] args) {
        SeaCreature creature = new SeaCreature("Spongebob") ;
        System.out.println(creature.getName());
        creature.eat();
        creature.laugh();

        SeaCreature patrick = new SeaCreature("Patrick") ;
        System.out.println(patrick.getName());
        patrick.laugh();

        SeaCreature squidward = new SeaCreature("Squidward") ;
        System.out.println(squidward.getName());
        squidward.laugh();
    }
}
