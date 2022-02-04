package entites;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueStock() {
		return quantity * price;
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ ", Total: $ "
		+ String.format("%.2f",TotalValueStock());
	}
	
}