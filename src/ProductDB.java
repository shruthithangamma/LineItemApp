
public class ProductDB {

	//public ProductDB(String productCode) {
		// TODO Auto-generated constructor stub
		
		
		
	//}
 
	public static ProductClass getDB(String productCode){
		
		ProductClass product = new ProductClass();
          
		product.setCode(productCode);
	       
	        
			switch (productCode) {
	            case "java":
	            	    product.setDescription("Murach's beginning Java");
	            	    product.setPrice(49.50);
	                     break;
	            case "jsps":
	                      product.setDescription("Murach's Java Servlets and JSP");
	                      product.setPrice(49.50);
	                     break;
	            case "mcb2":
	            	     product.setDescription("Murach's Mainframe cobol");
	            	     product.setPrice(59.50);
	            	     break;
	            default: System.out.println("Unknown product code"); 	
	                     break;
			}
			return product;
}
}