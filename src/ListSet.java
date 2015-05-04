//import java.util.*;
//
///* Question 2: Implement a Set abstract data type using singly linked lists
//*/
//public class ListSet<E> implements Iterable<E>{
//	SinglyLinkedList<E> sl;
//
//	public ListSet(){
//		sl = new SinglyLinkedList<E>();
//	}
//
//	public void add(E e){
//		if(!contains(e))
//			sl.add(e);
//	}
//
//	public void clear(){
//		sl.clear();
//	}
//
//	public void remove(E e){
//		sl.remove(e);
//	}
//	public int size(){
//		return sl.size();
//	}
//	public boolean contains(E e){
//		if(sl.indexOf(e)!= -1)
//			return true;
//		else
//			return false;
//	}
//
//    //Complete the product method which outputs the Cartesian product of this and s
//    //YOu must use the Tuple class that implements an ordered tuple
//	public ListSet<Tuple<E>> product(ListSet<E> s){
//        ////Write your code below
//
//        ////Write your code above
//	}
//
//
//	public Iterator<E> iterator(){
//		return sl.iterator();
//	}
//
//    //This method checks if this is a superset of the given set s1
////	public boolean superset(ListSet<E> s1){
////        ////Write your code below
////
////        ////Write your code above
////	}
//
//    //This method checks if this is a subset of the given set s2
////	public boolean subset(ListSet<E> s2){
////        return s1.superset(this);
////	}
//
//    //This method returns a String representing this set
////	public String toString(){
////        ////Write your code below
////
////        ////Write your code above
////	}
//
//    //This method returns the union of this and s
////	public ListSet<E> union(ListSet<E> s){
////        ////Write your code below
////
////        ////Write your code above
////	}
//
//    //This method returns the set difference of this versus s
////	public ListSet<E> difference(ListSet<E> s){
////        ////Write your code below
////
////        ////Write your code above
////	}
//
//    //This method returns the intersection of this and s
////	public ListSet<E> intersection(ListSet<E> s){
////        ////Write your code below
////
////        ////Write your code above
////	}
//
//	public boolean equals(ListSet<E> s){
//		return subset(s)&&superset(s);
//	}
//
//    //You are not allowed to change the main method in anyway
//	public static void main(String[] args){
//		ListSet<String> l1 = new ListSet<String>();
//		char c='e';
//		for(int i=0;i<7;i++){
//			l1.add(""+c);
//			c++;
//		}
//
//		l1.remove("h");
//		l1.remove("c");
//		l1.add("e");
//		l1.add("f");
//
//
//		ListSet<String> l2 = new ListSet<String>();
//		l2.add("e");
//		l2.add("f");
//
//		ListSet<String> l3=new ListSet<String>();
//
//
//		System.out.println("l1="+l1+" l2="+l2+" l3="+l3);
//
//		if(l1.superset(l2)){
//			System.out.println("l1 is a superset of l2");
//		}
//		if(l3.subset(l1)){
//			System.out.println("l3 is a subset of l1");
//		}
//
//
//		c='h';
//		for(int i=0;i<6;i++){
//			l3.add(""+c);
//			c++;
//		}
//		l2.clear();
//		c='m';
//		for(int i=0;i<6;i++){
//			l2.add(""+c);
//			c--;
//		}
//		System.out.println("l2="+l2+" l3="+l3);
//
//		System.out.println("l1 union l3 is "+l1.union(l3));
//		System.out.println("l1 intersect l3 is "+l1.intersection(l3));
//
//        System.out.print("The elements in l1 are ");
//        for(String s: l1)
//            System.out.print(" "+s);
//        System.out.print("\n");
//
//		if(l2.equals(l3))
//			System.out.println("l2 equals l3");
//
//		l2.clear();
//		l2.add("0");
//		l2.add("1");
//		System.out.println(l1.product(l2));
//	}
//
//}
