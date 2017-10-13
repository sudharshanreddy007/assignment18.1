package iterate;


import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray{
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class
	public static void main(String[] args) { 
						
		//here I'm creating an array list to add String elements so I made it of string type 
	      
		//ArrayList<String>() : this will create an empty list with initial capacity of 5.
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("bumrah"); //here I'm adding 5 elements to the array list 
		studentList.add("buvaneswar");          //  we are using the add method to add objects to the array list:
		studentList.add("ashwin");
		studentList.add("jadeja");
		studentList.add("pandya");
		
		 Iterator <String> listIterator = studentList.iterator();//getting Iterator from array list to traverse elements  
	   
		 while (listIterator.hasNext()){       // object next() :it returns the element and moves the cursor pointer to next element.
			
			 String student = (String)listIterator.next(); //traversing elements of ArrayList object  
			
			 if (student.equals("buvaneswar")){
				 listIterator.remove();
		//remove(int index) method of arraylist removes the element at the specified position(index) in the list.
				 System.out.println("buvaneswar is removed");//here in the output it shows buvaneswar  instead of we removed it after this iteration it will be removed
			 }
			 
	       System.out.println(student);  
	      
	  }

	}
}