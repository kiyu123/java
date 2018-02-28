
public class exam2_Q3_StaticVSNonStatic {
  
	int x=200;
   static int t= 6000;		 

 public static void main(String[] args) {
		// TODO Auto-generated method stub

		year(); // 1.1 we have to call year here because it is static function argument
		
		
		
		// 2.1 we have to create the objective because non static function will not work straight
		exam2_Q3_StaticVSNonStatic x = new exam2_Q3_StaticVSNonStatic();
		x. month ();
		
		System.out.println(t); 
		
		// 3. Print the non static global variable, right after the 2nd line public class we have to write
		// int t= 600; (you can pick any numbers and variable)
		 
		
	}

	//   1. Static Statement Example 
	
	public static void year()
	{
		System.out.println("This is 2018");
	}
	
	
	// 2. Non Static Statement example
	
	public void month()
	{
		System.out.println("This is June");
	}
		
	
}
