public class Queue {
	int counter, lineSize, lineMax;
	public Customer first, last;
	
	public Queue() {
		counter = lineSize = lineMax = 0;
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
		
		incLineSize();
		maxLineSize();
	}
	
	public Customer dequeue() {
		if(isEmpty()) {
			System.out.println("The line is empty - there is nothing to remove.");
			
			return null;
		}
		
		Customer temp = first;
		
		first = first.getNext();
		
		if(first == null) {
			last = null;
		}
		
		decLineSize();
		
		return temp;
	}
	
	public void examineLine() {
		Customer c = first;
		
		while(c != null) {
			System.out.println(c);
			c = c.getNext();
		}
	}
	
	public int getLineSize() {
		return lineSize;
	}
	
	public void incLineSize() {
		lineSize++;
	}
	
	public void decLineSize() {
		lineSize--;
	}
	
	public int getLineMax() {
		return lineMax;
	}
	
	public void maxLineSize() {
		if(lineSize > lineMax) {
			lineMax = lineSize;
		}
	}
}
