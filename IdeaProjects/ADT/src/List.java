/*
Lyndsey Wilson
ID#684781
 */
public interface List <T>
{
    void insertFirst(T item);
    void insertLast(T item);

    void deleteItem(T item);
    void replaceItem(int pos, T item);
    T removeFirst();
    T removeLast();

    boolean find(T item);
    boolean isEmpty();
    int size();

    T getFirst();
    T getLast();
    T getItemAt(int pos);
}
