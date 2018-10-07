/*
Lyndsey Wilson
ID#684781
 */
public interface Tree<T>
{
    void insert(T item);
    void remove(T item);
    void traversal();

    boolean find(T item);
    int height();

    void dumpDFS();
    void dumpBFS();
}
