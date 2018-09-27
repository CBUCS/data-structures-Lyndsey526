/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/set-in-java/
 */

public class Set<T>
{
    private LinkedList<T> set;

    public Set()
    {
        set = new LinkedList<T>();
    }

    //insert the value of item into set
    public void insert(T item)
    {
        if(!set.contains(item))
            set.insertFirst(item);
    }

    //deleting a value from the set
    public void delete(T item)
    {
        set.deleteItem(item);
    }

    //checking to see if has specific item
    public boolean contains(T item)
    {
        return set.contains(item);
    }

    //return number of items in the set
    public int size()
    {
        return set.size();
    }
}
