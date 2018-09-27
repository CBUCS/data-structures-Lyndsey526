/*
Lyndsey Wilson
ID#684781
 */
public class ADT_Test
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst() + "\n");

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);

        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast() + "\n");

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.deleteItem(1);
        list.deleteItem(5);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        System.out.println(list.contains(3));
        System.out.println(list.contains(5) + "\n");

        BinaryTree<Integer> tree = new BinaryTree<>();
        BinaryTree<Integer> oneTree = new BinaryTree<>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        oneTree.insert(1);

        tree.traversal();
        oneTree.traversal();

        System.out.println(tree.find(3));
        System.out.println(tree.find(8));
        System.out.println(oneTree.find(1));
        System.out.println(oneTree.find(8));

        System.out.println("HEIGHT: " + tree.height());
        System.out.println("HEIGHT: " + oneTree.height() + "\n");

        tree.remove(1);
        tree.remove(2);
        tree.remove(3);
        tree.traversal();

        oneTree.remove(1);
        oneTree.traversal();

        NaryTree<Integer> ntree = new NaryTree<>(2);
        ntree.insert(1);
        ntree.insert(2);
        ntree.insert(3);
        ntree.insert(4);
        ntree.insert(5);
        ntree.insert(6);
        ntree.insert(7);

        ntree.traversal();

        System.out.println(ntree.find(3));
        System.out.println(ntree.find(8));
        System.out.println("HEIGHT: " + ntree.height());

        ntree.remove(1);
        ntree.remove(2);
        ntree.remove(3);
        ntree.traversal();
        System.out.println();

        NaryTree<Integer> n3tree = new NaryTree<>(3);
        n3tree.insert(1);
        n3tree.insert(2);
        n3tree.insert(3);
        n3tree.insert(4);
        n3tree.insert(5);
        n3tree.insert(6);
        n3tree.insert(7);

        n3tree.traversal();

        System.out.println(n3tree.find(3));
        System.out.println(n3tree.find(8));
        System.out.println("HEIGHT: " + n3tree.height());

        n3tree.remove(1);
        n3tree.remove(2);
        n3tree.remove(3);
        n3tree.traversal();

        Stack<Integer> stack = new Stack<>();
        System.out.println("\n" + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());

        Queue<Double> queue = new Queue<>();
        System.out.println("\n" + queue.isEmpty());
        queue.enqueue(1.2);
        queue.enqueue(2.5);
        queue.enqueue(3.7);
        queue.enqueue(4.1);
        System.out.println(queue.front());
        System.out.println(queue.back());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.front());

        Set<String> set = new Set<>();
        System.out.println("\n" + set.size());
        set.insert("apple");
        set.insert("orange");
        set.insert("banana");
        set.insert("grape");
        set.insert("apple");
        set.insert("cherry");
        set.insert("banana");
        System.out.println(set.size());
        System.out.println(set.contains("apple"));
        System.out.println(set.contains("watermelon"));
        set.delete("grape");
        set.delete("watermelon");
        System.out.println(set.size());
        System.out.println(set.contains("grape"));

        Deque<Character> deque = new Deque<>();
        System.out.println("\n" + deque.isEmpty());
        deque.insertFirst('a');
        deque.insertFirst('b');
        deque.insertLast('c');
        deque.insertLast('d');
        deque.insertLast('e');
        System.out.println(deque.isEmpty());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.isEmpty());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
