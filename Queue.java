public class Queue {
	int counter;
	public Customer first, last;
	
	public Queue() {
		counter = 0;
		first = last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void enqueue(Customer c) {
		if(isEmpty()) {
			first = last = c;
		}else {
			last.setNext(c);
			last = c;
		}
	}
	
	public Customer dequeue() {
		if(isEmpty()) {
			System.out.println("The list is empty - there is nothing to remove.");
			
			return null;
		}
		
		Customer temp = first;
		
		first = first.getNext();
		
		if(first == null) {
			last = null;
		}
		
		return temp;
	}
	
	public void examineLine() {
		Customer c = first;
		
		while(c != null) {
			System.out.println(c);
			counter++;			c = c.getNext();
		}
	}
	
	public int getLineSize() {
		Customer c = first;
		
		while(c != null) {
			counter++;
			c = c.getNext();
		}
		
		return counter;
	}
 }
