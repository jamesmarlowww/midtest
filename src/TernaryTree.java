import java.util.ArrayList;
import java.util.Stack;

import static java.lang.Math.max;

//Question 3: Ternary Tree
//This class implements a ternary tree using a linked-based implementation
//Each node contains references to its left, center and right children
//as well as a reference to its parent

public class TernaryTree<E> {

    protected E val;
    protected TernaryTree<E> parent;
    protected TernaryTree<E> left, center, right;
    protected ArrayList<TernaryTree<E>> leaveList = new ArrayList<>();

    //Create an empty node (i.e. sentinel)
    public TernaryTree() {
        val = null;
        parent = null;
        left = right = center = this;
    }

    //Create a leaf
    public TernaryTree(E value) {
        //// Write your code below
        val = value;
        right = center = left = new TernaryTree<>();
        setLeft(left);
        setCenter(center);
        setRight(right);

        //// Write your code above
    }

    //Create an internal node
    public TernaryTree(E value, TernaryTree<E> left, TernaryTree<E> center, TernaryTree<E> right) {
        //// Write your code below
        val = value;
        if (left == null) {
            left = new TernaryTree<>();
        }
        setLeft(left);
        if (right == null) {
            right = new TernaryTree<>();
        }
        setRight(right);

        if (center == null) {
            center = new TernaryTree<>();
        }
        setCenter(center);
        //// Write your code above
    }

    public E value() {
        return val;
    }

    public TernaryTree<E> left() {
        return left;
    }

    public TernaryTree<E> right() {
        return right;
    }

    public TernaryTree<E> center() {
        return center;
    }

    public TernaryTree<E> parent() {
        return parent;
    }

    public boolean isEmpty() {
        return val == null;
    }

    public void setLeft(TernaryTree<E> newLeft) {
        if (isEmpty()) return;
        if (left != null && left.parent() == this)
            left.setParent(null);
        left = newLeft;
        left.setParent(this);
    }

    public void setCenter(TernaryTree<E> newCenter) {
        if (isEmpty()) return;
        if (center != null && center.parent() == this)
            center.setParent(null);
        center = newCenter;
        center.setParent(this);
    }


    public void setRight(TernaryTree<E> newRight) {
        if (isEmpty()) return;
        if (right != null && right.parent() == this)
            right.setParent(null);
        right = newRight;
        right.setParent(this);
    }

    protected void setParent(TernaryTree<E> newParent) {
        if (!isEmpty()) {
            parent = newParent;
        }
    }

    //Return the height of the ternary tree
    public int height() {
        //// Write your code below
        if (val == null) {
            return 0;
        } else {
            int max = Math.max(left.height(), center.height());
//            return 1+Math.max(max,right.height());
            return max(max, right.height()) + 1;
        }
        //// Write your code above
    }

    //Return true if and only if this node is a leaf node (not an empty node)
    public boolean isLeaf() {
        //// Write your code below
        boolean result = false;
        if (left.val == null && center.val == null && right.val == null) {
            result = true;
        }
        return result;
        //// Write your code above

    }

    /*Return a String representing the tree
    *The String should contain all nodes written in a preorder
    *traversal following the order:
    *parent -> left tree -> center tree -> right tree
	*/
    public String toString() {
        //// Write your code below
        String s = "";
        if (val != null) {

//            System.out.print("("+val+")");
            s= "("+val+":"+"("+ right.toString()+")("+center.toString()+")("+ left.toString()+")";

        }

        return s;

        //// Write your code above
    }


    public String preorderTraverseTree() {
        String s = "";
        if (val != null) {

            System.out.println("" + val);

            right.preorderTraverseTree();
            center.preorderTraverseTree();
            left.preorderTraverseTree();

        }

        return s;



    }


    //Return the level of the node
    public int level() {
        //// Write your code below
        if (parent() == null) {
            return 0;
        }
        return 1 + parent().level();

        //// Write your code above
    }

    // Return an ArrayList storing the values of all leaves in the tree
    public ArrayList<TernaryTree<E>> leaves() {
        //// Write your code below
        ArrayList<TernaryTree<E>> list = new ArrayList<>();



        if (left.val != null) {
            list.addAll(left.leaves());
        }
        if (center.val != null) {
            list.addAll(center.leaves());
        }
        if (right.val != null) {
            list.addAll(right.leaves());
        }
        if (left.val == null && right.val == null && center.val == null) {
            list.add(this);
        }

        return list;
        //// Write your code above
    }

    public ArrayList<TernaryTree<E>> getLeaveList() {
        return leaveList;
    }

    public static void main(String[] args) {
        TernaryTree<String> a = new TernaryTree<String>("a");
        TernaryTree<String> b = new TernaryTree<String>("b");
        TernaryTree<String> c = new TernaryTree<String>("c");
        TernaryTree<String> d = new TernaryTree<String>("d");
        TernaryTree<String> e = new TernaryTree<String>("e");
        TernaryTree<String> f = new TernaryTree<String>("f");
        TernaryTree<String> g = new TernaryTree<String>("g");
        TernaryTree<String> h = new TernaryTree<String>("h");
        TernaryTree<String> i = new TernaryTree<String>("i");
        TernaryTree<String> j = new TernaryTree<String>("j");
        TernaryTree<String> k = new TernaryTree<String>("k");
        TernaryTree<String> m = new TernaryTree<String>("m");

        a.setLeft(b);
        a.setCenter(c);
        a.setRight(d);
        b.setLeft(e);
        b.setRight(f);
        c.setCenter(g);
        c.setRight(h);
        f.setCenter(i);
        g.setLeft(j);
        g.setCenter(k);
        g.setRight(m);


        System.out.println("The tree rooted at a is " +a.toString());

        System.out.println("The Leaves in this tree are ");
        ArrayList<TernaryTree<String>> leaves = a.leaves();
        for (TernaryTree<String> t : leaves) {
            System.out.println("\t" + t.value() + " at level " + t.level());
        }
        System.out.println("The height of the tree is " + a.height());


    }




}
