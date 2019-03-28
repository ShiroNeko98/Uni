// Duy Do Quoc, 01622040 und Sarah Tomola, 11820646

import java.util.*;

public class BufferDemo {
	public static void main(String[] args) {
		Random r = new Random();
		
		MyBuffer<Boolean> boolean1 = new MyBuffer<Boolean>(0);		//leerer  Puffer
		System.out.println("Capacity: " + boolean1.getCapacity());
		System.out.println(boolean1.size());
		System.out.println(boolean1.isEmpty());
		
		
		MyBuffer<String> string1 = new MyBuffer<String>(3);		//Puffer mit Kapazitaet 3
		System.out.println("peek: " + string1.peek());
		string1.insert("Hallo");
		string1.insert("wie geht's");
		string1.insert("dir");
		System.out.println("peek: " + string1.peek());
		System.out.print("get: " + string1.get() + ", ");
		System.out.println(string1.get());
		string1.insert("denn heute");
		string1.insert("?");
		
		while(string1.peek() != null)		//clear
			string1.get();
		string1.insert("Guten Tag, ");
		string1.insert("guten Abend ");
		string1.insert("und gute Nacht.");
		System.out.println("peek: " + string1.peek());
				
		
		MyBuffer<Integer> int1 = new MyBuffer<Integer>(1000);
		for(int i = 0; i < int1.getCapacity()*3/4; i++)
			int1.insert(r.nextInt());
		for(int i = 0; i <= 1000; i++) {
			int help = r.nextInt(6);
			if(help == 0)
				int1.insert(r.nextInt());
			else if(help == 1)
				int1.get();
			else if(help == 2)
				int1.peek();
			else if(help == 3)
				int1.isEmpty();
			else if(help == 4)
				int1.isFull();
			else int1.size();
		}
	}
}
