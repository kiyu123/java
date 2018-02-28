
public class single_double_array_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Single Array 
    String Days []= new String [7];
    Days [0]="Monday";
    Days [1]="Tuesday";
    Days [2]="Wednesday";
    Days [3]="Thursday";
    Days [4]="Friday";
    Days [5]="Saturday";
    Days [6]="Sunday";
    System.out.println(Days[0]);
    System.out.println(Days[6]);
       //Double Array    
    String Month[][]=new String [2][4];
       //First Row
    Month[0][0]="Jan";
    Month[0][1]="Feb";
    Month[0][2]="Mar";
    Month[0][3]="Apr";
      //Second Row
    Month[1][0]="May";
    Month[1][1]="Jun";
    Month[1][2]="Jul";
    Month[1][3]="Aug";
    System.out.println(Month[0][0]);
      //Arguments for rows and columns
    int rows= Month.length;
    int cols= Month[0]. length;
       //For loop for row
    for(int rownum=0;rownum<rows; rownum++)
       //For Loop for column
    for(int colnum=0; colnum< cols; colnum++)
    System.out.println(Month[rownum][colnum]);
    
    	
    
	}

}
