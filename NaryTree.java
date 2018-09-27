/*
Lyndsey Wilson
ID#684781

 */
public class NaryTree<T> implements Tree<T>
{
    public class TreeNode<T>
    {
        T value;
        LinkedList<TreeNode<T>> children;
    }

    private TreeNode<T> root;
    private int N;

    public NaryTree(int N)
    {
        this.N = N;
        root = null;
    }
    //insert item in the tree at the top left most open position
    public void insert(T value)
    {
        Queue<TreeNode<T>> queue = new Queue<>();
        queue.enqueue(root);

        TreeNode newNode = new TreeNode();
        newNode.value = value;
        newNode.children = new LinkedList();
        for(int i = 0; i < N; i++)
            newNode.children.insertFirst(null);

        while(!queue.isEmpty())
        {
            TreeNode<T> node = queue.dequeue();
            if(node == null) {
                root = newNode;
                return;
            }
            for(int i = 0; i < N; i++)
            {
                if(node.children.get(i) == null) {
                    node.children.replaceItem(i, newNode);
                    return;
                }
            }
            for(int i = 0; i < N; i++)
                queue.enqueue(node.children.get(i));
        }
    }

    //removes item from tree and replaces with the bottom right most element
    public void remove(T item)
    {
        TreeNode<T> node = findNode(item), parent = null;
        if(node != null) {
            LinkedList<TreeNode<T>> list = new LinkedList<>();
            list.insertLast(root);
            int start = 0;

            while(start < list.size())
            {
                TreeNode<T> t = list.get(start);
                for(int i = 0; i < N; i++) {
                    if (t.children.get(i) != null)
                        list.insertLast(t.children.get(i));
                }
                start++;
            }

            int childNo = 0;
            for(int i = 0; i < list.size(); i++) {
                for(int j = 0; j < N; j++) {
                    if (list.get(i).children.get(j) == list.getLast()) {
                        parent = list.get(i);
                        childNo = j;
                    }
                }
            }

            if(parent == null)
                root = null;
            else {
                node.value = list.getLast().value;
                parent.children.replaceItem(childNo, null);
            }
        }
    }
    //printout preordered version of the tree
    public void traversal()
    {
        System.out.print("Nary Tree: ");
        traversalHelper(root);
        System.out.println();
    }

    //helps the traversal function solve problem
    private void traversalHelper(TreeNode<T> ptr)
    {
        if(ptr != null)
        {
            System.out.print(ptr.value + " ");
            for(int i = 0; i < N; i++)
                traversalHelper(ptr.children.get(i));
        }
    }
    // find a specific tree node that contains item
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
            for(int i = 0; i < N; i++)
                if ((t = findNodeHelper(ptr.children.get(i), item)) != null)
                    return t;
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
            else {
                boolean isFound = false;
                for (int i = 0; i < N; i++) {
                    isFound = isFound || findHelper(ptr.children.get(i), item);
                }
                return isFound;
            }
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
        else {
            int height = -1;
            for(int i = 0; i < N; i++)
                height = max(height, heightHelper(ptr.children.get(i)));
            return 1 + height;
        }
    }

    //largest number of two values
    private int max(int val1, int val2)
    {
        if(val1 > val2)
            return val1;
        else
            return val2;
    }

    //
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
            for(int i = 0; i < N; i++)
                traversalHelper(ptr.children.get(i));
        }
    }
    //start at the root
    public void dumpBFS()
    {
        Queue<TreeNode<T>> queue = new Queue<>();
        queue.enqueue(root);
        System.out.print("BFS: ");
        while(!queue.isEmpty())
        {
            TreeNode<T> node = queue.dequeue();
            System.out.print(node.value + " ");
            for(int i = 0; i < N; i++) {
                if (node.children.get(i) != null)
                    queue.enqueue(node.children.get(i));
            }
        }
        System.out.println();
    }
}
