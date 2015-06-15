import java.text.NumberFormat;


public class ProductClass {

	public ProductClass() {
		// TODO Auto-generated constructor stub
		  code = "";
		 description = "";
		  price = 0.0;
	}
	

	
 private String code;
 private String description;
 private double price;
private double FormattedPrice;


public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
} 
public double getFormattedPrice() {
	return FormattedPrice;	
}	
 
public String formattedPrice(){
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	return currency.format(price);
}
}
