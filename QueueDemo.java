//Duy Do Quoc, 01622040
//Sarah Maria Tomola, 11820646

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		Random r = new Random();
		
		//leere Warteschlange
		DynamicQueue<Boolean> boolean1 = new DynamicQueue<Boolean>();		
		System.out.println("leere Warteschlange");
		System.out.println("Size: " + boolean1.size());
		System.out.println("isEmpty: " + boolean1.isEmpty());
		System.out.println("String: " + boolean1.toString() + "\n");
		
		//drei Elemente einreihen und entfernen
		DynamicQueue<String> string1 = new DynamicQueue<String>();		
		System.out.println("Peek: " + string1.peek());
		string1.enqueue("Guten Tag, ");
		string1.enqueue("guten Abend ");
		string1.enqueue("und gute Nacht.");
		System.out.println("Peek: " + string1.peek());
		System.out.println("Dequeue: " + string1.dequeue());
		string1.enqueue("keine Ahnung");
		string1.enqueue("irgendwas");		
		System.out.println("Size: " + string1.size());
		System.out.println("String: " + string1.toString() + "\n");
		
		System.out.println("Clear");
		while(string1.peek() != null)
			string1.dequeue();
		string1.enqueue("Hier koennte");
		string1.enqueue(" Ihre Werbung ");
		string1.enqueue("stehen!");
		System.out.println("String: " + string1.toString());
		
		//zufaellige Operationen	
		DynamicQueue<Integer> int1 = new DynamicQueue<Integer>();
		for(int i = 0; i <= 1000; i++)
			int1.enqueue(i);
		for(int i = 0; i <= 1000; i++) {
			int help = r.nextInt(6);
			switch(help) {
				case 0: int1.enqueue(r.nextInt());
						break;
				case 1: int1.dequeue();
						break;
				case 2: int1.peek();
						break;
				case 3: int1.isEmpty();
						break;
				case 4: int1.size();
						break;
				case 5: int1.toString();
						break;	
			}
		}
	}
}
