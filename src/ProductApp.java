import java.util.Scanner;


public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String choice = "y";
		int quantity = 0;
		double total = 0;
		double price;
		String productCode = "";
		 
		 
	        while (!choice.equalsIgnoreCase("n") && choice.equalsIgnoreCase("y"))
	        
		  {
		System.out.println("Welcome to  the Line Item Calculator");
		
		  System.out.println("Enter the product code: ");
		    productCode = sc.next();
		    System.out.println("Enter the product quantity: ");
		    quantity = sc.nextInt(); 
		 
		       System.out.println("LINE ITEM");
		       System.out.println("Code: " +productCode);
		       
                 ProductClass product = ProductDB.getDB(productCode);
                 
              System.out.println("Product Description is: " +product.getDescription()); 
              System.out.println("Product Price is: " + product.getPrice());
      
                LineItem item = new LineItem();
     
                item.setQuantity(quantity);
     
                price = product.getPrice();
     
                item.setTotal(total);
     
             System.out.println("Product quantity is :" + item.getQuantity());
             total = quantity * price;
             System.out.println("Product total is : $"+total);
             
             System.out.print("Continue? (y/n): ");
             choice = sc.next();
             System.out.println();
		  }
	
             
	}

            
	}
	

