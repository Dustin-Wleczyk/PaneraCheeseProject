/*
 * Creates the order object
 * 
 * Dustin Wleczyk
 * LSU ID: 891888894
 * 
 * 
 * 
 * 
 */



public class Order {
	
	
	private String order;
	private String name;
	private String timestamp;
	
	public Order(String theOrder, String theName, String time) {
		order = theOrder;
		name = theName;
		timestamp = time;
	}
	
	
	public String returnOrder() {
		return order;
	}
	
	public String returnName() {
		return name;
	}
	
	public String returnTime() {
		return timestamp;
	}
	

}
