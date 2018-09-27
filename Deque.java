/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/deque-set-1-introduction-applications/
 */
public class Deque<T>
{
    private LinkedList<T> que;

    public Deque()
    {
        que = new LinkedList<T>();
    }

    //put item at front of deque
    public void insertFirst(T item)
    {
        que.insertFirst(item);
    }

    //put item at back of deque
    public void insertLast(T item)
    {
        que.insertLast(item);
    }

    //remove first item from deque
    public T removeFirst()
    {
        return que.removeFirst();
    }

    //remove last item from deque
    public T removeLast()
    {
        return que.removeLast();
    }

    //get first item from deque
    public T getFirst()
    {
        return que.getFirst();
    }

    //get lasst item from deque
    public T getLast()
    {
        return que.getLast();
    }

    //checks to see if anything in deque
    public boolean isEmpty()
    {
        return que.isEmpty();
    }
}
