// Duy Do Quoc, 01622040 und Sarah Tomola, 11820646

public class MyBuffer<T> {
	
	private T[] buffer;
	
	//constructor, creats an empty buffer with given capacity
	@SuppressWarnings("unchecked")
	public MyBuffer (int capacity) {
		buffer = (T[]) new Object[capacity];
		for(int i = 0; i < buffer.length; i++)
			buffer[i] = null;
	}

	//inserts item at the end of this buffer,
	//no action if this buffer is full
	public void insert (T item) {
		for(int i = 0; i < buffer.length && isFull() == false; i++)
			if(buffer[i] == null) {
				buffer[i] = item;
				break;
			}
	}

	//returns the first item and removes it from this buffer,
	//returns null, if this buffer is empty
	public T get () {
		if(isEmpty())
			return null;
		
		T help = buffer[0];
		buffer[0] = null;		//fuer den Fall: buffer.length = 1
		for(int i = 1; i < buffer.length && buffer[i] != null; i++) {
			buffer[i - 1] = buffer[i];
			buffer[i] = null;
		}
		return help;		
	}

	//returns the first item of this buffer without deleting
	//returns null, if this buffer is empty
	public T peek () {
		if(isEmpty())
			return null;
		return buffer[0];
	}

	//returns true if this buffer contains no elements
	public boolean isEmpty () {
		if(size() == 0)		//keine Elemente
			return true;
		else return false;
	}

	//returns true if this buffer's capacity is achieved
	public boolean isFull () {
		if(size() == buffer.length)
			return true;
		else return false;
	}

	//returns the number of elements in this buffer
	public int size () {
		int count = 0;
		for(int i = 0; i < buffer.length; i++)
			if(buffer[i] != null)
				count++;
		return count;
	}
	
	public int getCapacity(){
		return buffer.length;
	}
}
