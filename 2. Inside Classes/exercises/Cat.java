public class Cat {
    private String name;
    private int lives = 9 ;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("meeeeeeeeoooooooooooowwwwwwwwww!!");
    }

    public void printName() {
        if (name == null)
            System.out.println("Whoops! I don't know my own name!");
        else
            System.out.println("My name is "+ name);
    }

    public void kill() {
        lives-- ;
        if (lives > 0)
            System.out.printf("Nice try! But I still have %d lives left😜 \n", lives);
        else if (lives < 0)
            System.out.println("That's overkilling, yo!🙀");
        else
            System.out.println("DEAD CAT ☹️");
    }

    public static void main(String[] args) {
        /* Do the following things without changing the Cat class */
        Cat becky = new Cat("Becky") ;
        Cat unknown = new Cat(null);

        // 1. Make the Cat meow
        becky.meow();

        // 2. Get the Cat to print its name
        becky.printName();
        unknown.printName();

        // 3. Kill the Cat!
        for (int i=0; i < 4; i++)
            becky.kill();

        System.out.println();

        for (int i=0; i < 10; i++)
            unknown.kill();

    }
}
