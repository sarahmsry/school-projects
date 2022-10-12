import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;

	public class Dequeue{
		static LinkedList<Integer> mainq;
		ArrayDeque<Integer> maxq;
		
		Dequeue(){ //constructor
			mainq = new LinkedList<>();
			maxq = new ArrayDeque<>();
		}
		void enqueue(int info) {
			while(!maxq.isEmpty() && maxq.getLast() < info) { //insert element into the correct spot 
				maxq.removeLast(); //removes last element in the deque
			}
			maxq.addLast(info); //add element from back 
			mainq.add(info);
		}
		void deque() {
			if(maxq.getFirst() == mainq.peek()) { //last element of the deque 
				maxq.removeFirst();
			}
			mainq.remove();
		}
		int getMax() throws Exception{ //Finds max element 
			if(mainq.isEmpty()) {
				throw new Exception("Queue is empty"); //Displays error is queue is empty 
			}else {
				return maxq.getFirst();
			}
		}
		public static void main(String[] args) throws Exception {
			Dequeue maxq = new Dequeue();
			while(true) { //asks user to select an option and enter an element 
				System.out.println("Select: ");
				System.out.println("1: Push");
				System.out.println("2: Pop");
				System.out.println("3: Main/Max queue");
				System.out.println("4: Quit");
				
				Scanner input = new Scanner(System.in);
				int option = input.nextInt();
				if(option == 1) {
					System.out.println("Enter element to evaluate: ");
					int num = input.nextInt();
					maxq.enqueue(num);
				}
				else if(option == 2) {
					System.out.println("Element removed");
					maxq.deque();
				}
				else if(option == 3) {
					System.out.println("Current elements in the main queue: " + mainq); //Displays main queue
					System.out.println("Current elements in the max queue: [" + maxq.getMax() + "]"); //Displays max queue
				}
				else if(option == 4) {
					break;
				}
				
			}
			
		}
	}