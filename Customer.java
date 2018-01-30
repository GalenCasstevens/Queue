public class Customer {
	private int id;
	private  Customer next;
	
	public Customer() {
		id = (int)(Math.random() * 100);
		next = null;
	}
	
	public void setNext(Customer c) {
		next = c;
	}
	
	public Customer getNext() {
		return next;
	}
	
	public String toString() {
		return "Customer ID: " + id;
	}
}
