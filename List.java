/*
Lyndsey Wilson
ID#684781
 */
public interface List<T>
{
    void add(T item);
    void add(int pos, T item);
    void insertFirst(T item);
    void insertLast(T item);
    void deleteItem(T item);
    void replaceItem(int pos, T item);
    T set(int pos, T item);
    void clear();

    T remove();
    T remove(int pos);
    boolean remove(T item);
    T removeFirst();
    T removeLast();

    boolean contains(T item);
    boolean isEmpty();
    int size();

    T getFirst();
    T getLast();
    T get(int pos);
}
