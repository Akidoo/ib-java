import java.util.Queue;
import java.util.LinkedList;

public class Queues {
	
	public static void main (String[] args) {
		
		//FIFO (First in first out) Data structure
		
		//add = enqueue, offer()
		//remove = dequeue, poll()
		
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Kamya");
		queue.offer("Akaash");
		queue.offer("Kai");
		queue.offer("Toby");
		queue.offer("Oliver");
		
		//System.out.println(queue.peek()); returns first index
		System.out.println(queue);
		
		
		for(int i = queue.size(); i>0; i--){
		queue.poll();
		
		System.out.println(queue);
	}
	}
}

