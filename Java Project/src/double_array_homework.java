
public class double_array_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Employee [][] =new String [4][4];
		// First row
		Employee [0][0]="Rutu";
	    Employee [0][1]="Anusha";
	    Employee [0][2]="Ramaya";
	    Employee [0][3]="Homaira";
	    // Second row
	    Employee [1][0]="Nir"; 
	    Employee [1][1]="Fal";
	    Employee [1][2]="Het";
	    Employee [1][3]="Kiyu";
	    //Third row
	    Employee [2][0]="Anay"; 
	    Employee [2][1]="Nimi";
	    Employee [2][2]="Edna";
	    Employee [2][3]="Lindsay";
	    //Fourth row
	    Employee [3][0]="Isha";
	    Employee [3][1]="Yesh";
	    Employee [3][2]="Kush";
	    Employee [3][3]="Kavita";
	    System.out.println(Employee[2][3]);
	    //arguments for rows and columns
	    int rows=Employee.length;
	    int cols=Employee[0].length;
	    //for loop for the row
	    for(int rownum =0; rownum<rows; rownum++)
	    //for loop for the column
	    for(int colnum =0; colnum<cols; colnum++)
	   
	    System.out.println(Employee[rownum][colnum]);
	
	    
	    
	}

}
