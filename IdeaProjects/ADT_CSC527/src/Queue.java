/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/queue-data-structure/
 */
public class Queue<T>
{
    private LinkedList<T> queue;

    public Queue()
    {
        queue = new LinkedList<T>();
    }

    //insert item at back of queue
    public void enqueue(T item)
    {
        queue.insertLast(item);
    }

    //remove item from front of queue
    public T dequeue()
    {
        return queue.removeFirst();
    }

    //get item at front of queue
    public T front()
    {
        return queue.getFirst();
    }

    //get item at back of queue

    public T back()
    {
        return queue.getLast();
    }

    //check to see if there is anything in the queue
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
}
