/*
Lyndsey Wilson
ID#684781
 */

public class ADT_Test2
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(list.size());
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0, 0);
        list.add(8, 10);
        list.add(5, 6);
        System.out.println(list.size());
        System.out.println(list.contains(0));
        System.out.println(list.contains(3));
        System.out.println(list.contains(6));
        System.out.println(list.contains(9));
        System.out.println(list.remove());
        System.out.println(list.remove(1));
        System.out.println(list.remove(3));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.set(0, 0));
        System.out.println(list.set(8, 0));
        System.out.println(list.get(0) + "\n");

        BinaryTree<Integer> tree1 = new BinaryTree<>();
        tree1.insert(6);
        tree1.insert(3);
        tree1.insert(7);
        tree1.insert(1);
        tree1.insert(4);
        tree1.insert(8);
        tree1.dumpDFS();
        tree1.dumpBFS();
        System.out.println();

        NaryTree<Integer> tree2 = new NaryTree<>(2);
        tree2.insert(6);
        tree2.insert(3);
        tree2.insert(7);
        tree2.insert(1);
        tree2.insert(4);
        tree2.insert(8);
        tree2.dumpDFS();
        tree2.dumpBFS();
        System.out.println();

        NaryTree<Integer> tree3 = new NaryTree<>(3);
        tree3.insert(6);
        tree3.insert(3);
        tree3.insert(7);
        tree3.insert(1);
        tree3.insert(4);
        tree3.insert(8);
        tree3.dumpDFS();
        tree3.dumpBFS();
    }
}
