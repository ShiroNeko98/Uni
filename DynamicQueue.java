//Duy Do Quoc, 01622040
//Sarah Maria Tomola, 11820646

public class DynamicQueue<T> {
	
	private Node tail, head;
	private int size;
	
	//constructor, creats an empty queue
	public DynamicQueue () {		
		this.tail = null;		//keine Daten, Zeiger zeigt auf null
		this.head = null;
	}
	
	private class Node{
		T data;			//Daten
		Node next;		//Zeiger
		
		Node (T d){
			data = d;
			next = null;
		}
	}

	//inserts item at the tail of this queue
	public void enqueue (T item) {			
		Node p = new Node(item);
		if(size == 0) {
			tail = p;
			head = tail;
			size++;
		} else {
		p.next = tail;
		tail = p;
		size++;
		}
	}

	//returns the head item and removes it from this queue,
	//returns null if this queue is empty

	public T dequeue () {
		if(isEmpty() == true)		//Queue ist leer
			return null;
		else if(size == 1) {
			size--;
			return head.data;
		}
			
		Node second = tail;		
		while(second.next != null && !second.next.equals(head))
			second = second.next;
		
		T help = head.data;
		head = second;
		size--;
		
		return help;
	}

	//returns the head item of this queue without removing,
	//returns null if this queue is empty
	public T peek () {
		if(size == 0)
			return null;
		else return head.data;					
	}

	//returns true if this queue contains no elements
	public boolean isEmpty () {
		if(size == 0)
			return true;
		else return false;
	}

	//returns the number of elements in this queue
	public int size () {
		return size;
	}

	//for demo purposes, returns a string in the form
	// [e1, e2, ...] where e1 is the head element
	public String toString () {
		if(size == 0)
			return "[]";
		else if(size == 1)
			return "[" + head.data.toString() + "]";
		
		Node node = tail;
		String help = "]";
		while(node.next != null && !node.next.equals(head)) {
			help = ", " + node.data.toString() + help;
			node = node.next;
		} help = "[" + head.data.toString() + ", " + node.data.toString() + help;
		
		return help;
	}
}
