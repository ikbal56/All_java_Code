package dailyprogram;

public class SweetShop implements Comparable<SweetShop> {

	private String sName;
	private double price;
	private int quantity;
	public SweetShop(String sName, double price, int quantity) {
		
		this.sName = sName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getsName() {
		return sName;
	}
	public Double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "SweetShop [sName=" + sName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(SweetShop o) {
		
		return getPrice().compareTo(o.getPrice());
	}
	
}
