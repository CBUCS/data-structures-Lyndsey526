/*
Lyndsey Wilson
ID#684781
 */
public interface Tree<T>
{
    void insert(T item);
    void remove (T item);
//printout preorderd version of the tree
    void traversal();
//finds an item in the tree
    boolean find(T item);
//Finds height of tree
    int height();
}
