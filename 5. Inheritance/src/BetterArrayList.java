import java.util.ArrayList;

public class BetterArrayList<E> extends ArrayList<E> {

//    Returns the last item added to the ArrayList
    public Object pop(){
        if (! this.isEmpty()) {
            Object lastItem = this.get(this.size() - 1);
            this.remove(lastItem);
            return lastItem ;
        }
        return null;
    }

//    Iterates through the list and print out the details
    public void print(){
        System.out.println("The items of the Array List are:");
        for(Object item: this){
            System.out.println(item.toString());
        }
    }

//    Insert an item at a given index
    public int insert(E item, int index){
        if (index < this.size())
            this.add(index, item);

        return this.size() ; // Return the (new) size of the list
    }
}
