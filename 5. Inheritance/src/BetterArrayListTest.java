import org.junit.Test ;
import static org.junit.Assert.* ;

public class BetterArrayListTest {

    @Test
    public void testPopAndInsert(){
        BetterArrayList<String> betterArrayList = new BetterArrayList<>();
        betterArrayList.add("Papa Smurf");
        betterArrayList.add("Smurfette");
        betterArrayList.add("Clumsy Smurf");
        betterArrayList.add("Greedy Smurf");

//        Testing pop() method
        assertEquals("Greedy Smurf", betterArrayList.pop());
        assertEquals("Clumsy Smurf", betterArrayList.pop());
//        assertEquals("Smurfette", betterArrayList.pop());
//        assertNull(betterArrayList.pop());

//        Testing insert(item, index) method
        assertEquals(2, betterArrayList.insert("Bla Bla", 4));
        assertEquals(3, betterArrayList.insert("Handy Smurf", 0));
    }

    @Test
    public void testPrint(){
        BetterArrayList<String> arrayList = new BetterArrayList<>();
        arrayList.add("Papa Smurf");
        arrayList.add("Smurfette");
        arrayList.add("Clumsy Smurf");
        arrayList.add("Greedy Smurf");

        arrayList.print();
    }
}
