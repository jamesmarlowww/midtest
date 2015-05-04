import java.util.ArrayList;

//Question 3: Ternary Tree
//This class implements a ternary tree using a linked-based implementation
//Each node contains references to its left, center and right children
//as well as a reference to its parent

public class TernaryTree<E>{

	protected E val;
	protected TernaryTree<E> parent;
	protected TernaryTree<E> left, center, right;

	//Create an empty node (i.e. sentinel)
	public TernaryTree(){
		val=null;
		parent=null;
		left=right=center=this;
	}

	//Create a leaf
	public TernaryTree(E value){
    //// Write your code below
    
    //// Write your code above
	}

	//Create an internal node
	public TernaryTree(E value, TernaryTree<E> left, TernaryTree<E> center, TernaryTree<E> right){
    //// Write your code below
    
    //// Write your code above
	}

	public E value(){
		return val;
	}
	public TernaryTree<E> left(){
		return left;
	}

	public TernaryTree<E> right(){
		return right;
	}

	public TernaryTree<E> center(){
		return center;
	}
	public TernaryTree<E> parent(){
		return parent;
	}

	public boolean isEmpty(){
		return val==null;
	}

	public void setLeft(TernaryTree<E> newLeft){
		if(isEmpty()) return;
		if(left!=null && left.parent()==this)
			left.setParent(null);
		left=newLeft;
		left.setParent(this);
	}

	public void setCenter(TernaryTree<E> newCenter){
		if(isEmpty()) return;
		if(center!=null && center.parent()==this)
			center.setParent(null);
		center=newCenter;
		center.setParent(this);
	}


	public void setRight(TernaryTree<E> newRight){
		if(isEmpty()) return;
		if(right!=null && right.parent()==this)
			right.setParent(null);
		right=newRight;
		right.setParent(this);
	}

	protected void setParent(TernaryTree<E> newParent){
		if(!isEmpty()){
			parent=newParent;
		}
	}

    //Return the height of the ternary tree
	public int height(){
    //// Write your code below
    
    //// Write your code above
	}

    //Return true if and only if this node is a leaf node (not an empty node)
    public boolean isLeaf(){
    //// Write your code below
    
    //// Write your code above
        
    }

    /*Return a String representing the tree
    *The String should contain all nodes written in a preorder 
    *traversal following the order: 
    *parent -> left tree -> center tree -> right tree
	*/
    public String toString(){
    //// Write your code below
    
    //// Write your code above
	}


    //Return the level of the node
	public int level(){
    //// Write your code below
    
    //// Write your code above
	}

    // Return an ArrayList storing the values of all leaves in the tree
    public ArrayList<TernaryTree<E>> leaves(){
    //// Write your code below
    
    //// Write your code above
    }

    public static void main(String[] args){
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
        
        System.out.println("The tree rooted at a is "+a);
        
        System.out.println("The Leaves in this tree are ");
        ArrayList<TernaryTree<String>> leaves = a.leaves();
        for(TernaryTree<String> t: leaves){
            System.out.println("\t"+t.value()+" at level "+t.level());
        }    
        System.out.println("The height of the tree is "+a.height());
    }

}
