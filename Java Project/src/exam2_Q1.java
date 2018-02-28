import java.util.Scanner;

public class exam2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// User_Input
		// Write the Java program asking your address, Your name, age, city, state etc.
		
		
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);

System.out.println("What is your name");
String name=reader.next();  // User input


System.out.println("What is your age");
int age =reader.nextInt();


System.out.println("What is your Address");
int Address= reader.nextInt();
String Streetname = reader.next();


System.out.println("What is your City");
String City=reader.next();


System.out.println("What is your State");
String State = reader.next();


System.out.println("What is your Zipcode");
int Zipcode = reader.nextInt();

System.out.println("My name is " + " " + name);
System.out.println("My age is" + " "  + age);
System.out.println("My Address is " + " "  + Address + " " + Streetname );
System.out.println("My city is " + " " + City);
System.out.println("I am From " + " " + State);
System.out.println("My zipcode is " + " " + Zipcode);

			
		
	}
	
	

}
