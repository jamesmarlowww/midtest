import java.util.Iterator;

//This is an Iterator for a singly linked list

public class ListIterator<E> implements Iterator<E>{

	SinglyLinkedList<E> list;
	Node<E> current;
	public ListIterator(SinglyLinkedList<E> l){
			list=l;
			current = list.head;
	}

	public boolean 	hasNext(){
			return current!=null;
	}


	public E next(){
			E value = current.value();
			current=current.next();
			return value;
	}

	public void remove(){

	}

}

