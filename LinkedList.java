/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/data-structures/linked-list/
 */
public class LinkedList<T> implements List<T>
{
    public class Node<T>
    {
        T value;
        Node link;
    }

    private Node<T> head, tail;
//constructur for a new linked list object

    public LinkedList()
    {
        head = null;
        tail = null;
    }
//insert item into link list at first position
    public void insertFirst(T item)
    {
        if(head == null)
        {
            head = new Node();
            head.value = item;
            head.link = null;
            tail = head;
        }
        else
        {
            Node newNode = new Node();
            newNode.value = item;
            newNode.link = head;
            head = newNode;
        }
    }
//insert item into link list at last position
    public void insertLast(T item)
    {
        if(tail == null)
        {
            tail = new Node();
            tail.value = item;
            tail.link = null;
            head = tail;
        }
        else
        {
            Node newNode = new Node();
            newNode.value = item;
            newNode.link = null;
            tail.link = newNode;
            tail = newNode;
        }
    }
//removes the first item in the linked list and returns it
    public T removeFirst()
    {
        if(head == null)
            return null;
        else if(head == tail)
        {
            T value = (T)head.value;
            head = null;
            tail = null;
            return value;
        }
        else
        {
            T value = (T)head.value;
            head = head.link;
            return value;
        }
    }
//removes the last item in the linked list and returns it
    public T removeLast()
    {
        if(tail == null)
            return null;
        else if(head == tail)
        {
            T value = (T)head.value;
            head = null;
            tail = null;
            return value;
        }
        else
        {
            T value = (T)tail.value;
            Node ptr = head;
            while(ptr.link != tail)
                ptr = ptr.link;
            tail = ptr;
            tail.link = null;
            return value;
        }
    }
//delete item from list if it exits
    public void deleteItem(T item)
    {
        Node ptr = head, before = null;
        while(ptr != null && ptr.value != item) {
            before = ptr;
            ptr = ptr.link;
        }
        if(before == null)
            removeFirst();
        else if(ptr == null)
            return;
        else
        {
            before.link = ptr.link;
            if(tail == ptr)
                tail = before;
        }
    }
//find item in the list returns true if is true
    public boolean find(T item)
    {
        Node ptr = head;
        while(ptr != null) {
            if(ptr.value == item)
                return true;
            ptr = ptr.link;
        }
        return false;
    }
//get the first item in linked list
    public T getFirst()
    {
        if(head == null)
            return null;
        else
            return (T)head.value;
    }
//get last item in linked list
    public T getLast()
    {
        if(tail == null)
            return null;
        else
            return (T)tail.value;
    }
//get's that item at the sepcific postion if it exists
    public T getItemAt(int pos)
    {
        if(pos >= size())
            return null;

        Node ptr = head;
        for(int i = 0; i < pos; i++)
            ptr = ptr.link;

        return (T)ptr.value;
    }
//checking to see if anything is in the list
    public boolean isEmpty()
    {
        return (head == null);
    }
//return number of elmenents in list
    public int size()
    {
        Node ptr = head;
        int count = 0;
        while(ptr != null)
        {
            count++;
            ptr = ptr.link;
        }
        return count;
    }
//replace that item at soecific postion with new item
    public void replaceItem(int pos, T item)
    {
        if(pos >= size())
            return;
        else
        {
            Node ptr = head;
            for(int i = 0; i < pos; i++)
                ptr = ptr.link;
            ptr.value = item;
        }
    }
}
