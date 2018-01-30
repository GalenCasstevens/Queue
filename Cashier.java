import java.util.Scanner;

public class Cashier {
	public static void main(String[] args) {
		Queue movieLine = new Queue();
		Scanner input = new Scanner(System.in);
		
		int choice = 0;
		
		while(choice != 5) {
			System.out.println("1: Add person to line");
			System.out.println("2: Remove person from line");
			System.out.println("3: Examine line");
			System.out.println("4: Display line size");
			System.out.println("5: Quit");
			
			choice = input.nextInt();
			
			if(choice == 1) {
				movieLine.enqueue(new Customer());
			}else if(choice == 2) {
				System.out.println("Removed: " + movieLine.dequeue());
			}else if(choice == 3) {
				movieLine.examineLine();
			}else if(choice == 4) {
				System.out.println(movieLine.getLineSize());
			}
		}
	}
}
