/*
Lyndsey Wilson
ID#684781

https://www.geeksforgeeks.org/insertion-binary-tree/
https://www.geeksforgeeks.org/binary-search-tree-data-structure/
 */
public class BinaryTree<T> implements Tree<T>
{
    public class TreeNode<T>
    {
        T value;
        TreeNode<T> left, right;
    }

    private TreeNode<T> root;

    public BinaryTree()
    {
        root = null;
    }

    //insert item in the tree at the top left most open position
    public void insert(T value)
    {
        Queue<TreeNode<T>> queue = new Queue<>();
        queue.enqueue(root);
        while(!queue.isEmpty())
        {
            TreeNode<T> node = queue.dequeue();
            if(node == null) {
                root = new TreeNode();
                root.value = value;
                root.left = null;
                root.right = null;
                return;
            }
            else if(node.left == null) {
                node.left = new TreeNode();
                node.left.value = value;
                node.left.left = null;
                node.left.right = null;
                return;
            }
            else if(node.right == null) {
                node.right = new TreeNode();
                node.right.value = value;
                node.right.right = null;
                node.right.left = null;
                return;
            }
            queue.enqueue(node.left);
            queue.enqueue(node.right);
        }
    }

    //removes item from tree and replaces with the bottom right most element
    public void remove(T item)
    {
        TreeNode<T> node = findNode(item), parent;
        if(node != null) {
            LinkedList<TreeNode<T>> list = new LinkedList<>();
            list.insertLast(root);
            int start = 0;

            while(start < list.size())
            {
                TreeNode<T> t = list.get(start);
                if(t.left != null)
                    list.insertLast(t.left);
                if(t.right != null)
                    list.insertLast(t.right);
                start++;
            }

            parent = list.get((list.size() / 2) - 1);
            if(parent == node)
                root = null;
            else if(parent.right != null) {
                node.value = parent.right.value;
                parent.right = null;
            }
            else {
                node.value = parent.left.value;
                parent.left = null;
            }
        }
    }
    //printout preordered version of the tree
    public void traversal()
    {
        System.out.print("Tree: ");
        traversalHelper(root);
        System.out.println();
    }
    //helps the traversal function solve problem
    private void traversalHelper(TreeNode<T> ptr)
    {
        if(ptr != null)
        {
            System.out.print(ptr.value + " ");
            traversalHelper(ptr.left);
            traversalHelper(ptr.right);
        }
    }

    //find a specific tree node that contains item
    private TreeNode<T> findNode(T item)
    {
        return findNodeHelper(root, item);
    }

    private TreeNode<T> findNodeHelper(TreeNode<T> ptr, T item)
    {
        if(ptr == null)
            return null;
        else
        {
            TreeNode<T> t;
            if(ptr.value == item)
                return ptr;
            else if((t = findNodeHelper(ptr.left, item)) != null)
                return t;
            else if((t = findNodeHelper(ptr.right, item)) != null)
                return t;
            else
                return null;
        }
    }
    //check to see if the item exits in the tree
    public boolean find(T item)
    {
        return findHelper(root, item);
    }

    private boolean findHelper(TreeNode<T> ptr, T item)
    {
        if(ptr == null)
            return false;
        else
        {
            if(ptr.value == item)
                return true;
            else
                return findHelper(ptr.left, item) || findHelper(ptr.right, item);
        }
    }
    //get the height of the tree
    public int height()
    {
        return heightHelper(root);
    }

    private int heightHelper(TreeNode<T> ptr)
    {
        if(ptr == null)
            return -1;
        else
            return 1 + max(heightHelper(ptr.left), heightHelper(ptr.right));
    }
    //largest number of two values
    private int max(int val1, int val2)
    {
        if(val1 > val2)
            return val1;
        else
            return val2;
    }

    public void dumpDFS()
    {
        System.out.print("DFS: ");
        dumpDFSHelper(root);
        System.out.println();
    }

    private void dumpDFSHelper(TreeNode<T> ptr)
    {
        if(ptr != null)
        {
            System.out.print(ptr.value + " ");
            traversalHelper(ptr.left);
            traversalHelper(ptr.right);
        }
    }

    public void dumpBFS()
    {
        Queue<TreeNode<T>> queue = new Queue<>();
        queue.enqueue(root);
        System.out.print("BFS: ");
        while(!queue.isEmpty())
        {
            TreeNode<T> node = queue.dequeue();
            System.out.print(node.value + " ");
            if(node.left != null)
                queue.enqueue(node.left);
            if(node.right != null)
                queue.enqueue(node.right);
        }
        System.out.println();
    }
}
