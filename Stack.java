/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/stack-data-structure/
 */
public class Stack<T>
{
    private LinkedList<T> stack;

    public Stack()
    {
        stack = new LinkedList<T>();
    }

    //remove item from top of stack
    public void push(T item)
    {
        stack.insertFirst(item);
    }

    //remove item from top of stack
    public T pop()
    {
        return stack.removeFirst();
    }

    //get item from top of stack
    public T top()
    {
        return stack.getFirst();
    }

    //checking to see if anything in stack
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
}
