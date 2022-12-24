package dailyprogram;

public class Vegetable {

	private String sName;
	private int quantity;
	private double price;
	public Vegetable(String sName, int quantity, double price) {
		super();
		this.sName = sName;
		this.quantity = quantity;
		this.price = price;
	}
	public String getsName() {
		return sName;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public void payment() {
		double totalprice=quantity*price;
		System.out.println(totalprice+ "You have to pay at counter");
	}
	
	
}
