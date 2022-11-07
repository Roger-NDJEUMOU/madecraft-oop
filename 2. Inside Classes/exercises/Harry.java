public class Harry {

    private boolean cloakOn ;

    public Harry(){
        System.out.println("Making Harry Potter...👦🏽");
    }

    public void castSpell(String spell){
        System.out.printf("Casting spell: %s \n", spell);
    }

    public void makeInvisible (boolean invisible){
        this.cloakOn = invisible ;
        if (cloakOn)
            System.out.println("Potter is invisible 👻");
        else
            System.out.println("Potter is visible 🤓");
    }

    public void spyOnSnape(){
        System.out.println("Harry sees Prof. Snape doing nefarious things.");
    }

    public static void main(String[] args) {
        // 1. make harry potter
        Harry harry = new Harry() ;

        // 2. become invisible
        harry.makeInvisible(true);

        // 3. spy on professor Snape
        harry.spyOnSnape();

        // 4. become visible again
        harry.makeInvisible(false);

        // 5. cast a “stupefy” spell
        harry.castSpell("Stupefy 🔥");

    }
}
