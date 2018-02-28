import java.util.Scanner;

public class Class_assig_Q1 {

	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		// Product available 
	
		Scanner reader =new Scanner(System.in); 
		
		int orange= 3;
		int banana=2;
		
	
	

	System.out.println("Please enter the product");
	String product= reader.next();  // User input	
     
	if(product.equals("orange"))
	{
	System.out.println("      Detail:  You Entered the product" + " " + product);
	System.out.println("      Price for this product is " + " " + "$" + orange);
	int a = 4 + orange;
	System.out.println("Amount due is" + a);
	}

	if (product.equals("banana"))
		{System.out.println("      Detail:  You Entered the product" + " " + product);
		System.out.println("      Price for this product is " + " " + "$" + banana);
		int t = 4 + banana;
		System.out.println("Amount due is" + t);
	}
	try {
		
	System.out.println ("Look up the prodct by ID");
	System.out.println("Please enter the product ID");
	int productid=reader.nextInt();  // User input
    System.out.println(" You Entered the product" + " " + product);
	System.out.println(" Price for this product is "+  " " + "$" + orange);
	int b = 4 + banana;
	System.out.println("Amount due is" + b);
	}
	catch(Exception e){
		System.out.println("You enterd invalid input");
	}
	
		finally {
	System.out.println("Thanks For Serching");
		
	}

	
	
	}













}
	


