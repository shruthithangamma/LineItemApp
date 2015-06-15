
public class LineItem {

	public  LineItem() {
		// TODO Auto-generated constructor stub
	ProductClass	product = new ProductClass();
	//Creating an Instance called 'product' from 'ProductClass'.
	
		quantity = 0;
		total = 0.0;
	}
    private ProductClass  product;
    private int quantity;
    private double total;
    
	public ProductClass getProduct() {
		return product;
	}
	public void setProductClass(ProductClass product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
    
}
