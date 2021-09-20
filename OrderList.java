/*
 * This simulates an order list that would be seen on a screen in a coffee shop
 * 
 * Dustin Wleczyk
 * LSU ID: 891888894
 * 
 * 
 * 
 * 
 */




import java.util.*;
import java.text.*;

public class OrderList {
	
	Queue<Order> queue = new LinkedList<>();
	
	
	public void addOrder() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the name of customer");
		String name = input.nextLine();
		System.out.println("Please input the order");
		String order = input.nextLine();
	
		Format formatIt = new SimpleDateFormat("HH.mm.ss");
		String date = formatIt.format(new Date());
		queue.add(new Order(order, name, date));
		
		
	}
	
	public void listOrders() {
		System.out.printf("%-10s%-10s%-10s\n", "Name", "Order", "Time");
		System.out.println("-------------------------------------------");
		
		if (queue.size() >= 1) {
			for (Order element: queue) {
				System.out.printf("%-10s%-10s%-10s\n", element.returnName(), element.returnOrder(), element.returnTime());
			}
		} else {
			System.out.println("No pending orders");
		}
		
		
		
	}
	
	public void serveNextOrder() {
		
		if (queue.size() >= 1) {
			System.out.println("Now serving ... " + queue.peek().returnName() + " " + queue.peek().returnOrder() + " " + queue.peek().returnTime());
			queue.poll();
		} else {
			System.out.println("No pending orders");
		}
		
		
	}
	
	public void cancelOrder() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name = input.nextLine();
		
		
		if (queue.removeIf(Order -> Order.returnName().toLowerCase().equals(name.toLowerCase())));
		
		
		
	}


}
