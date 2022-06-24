package javaseissions;

public class Assignment {

	public static void main(String[] args) {
		
		// Assignment 1 - Assign grade according t marks obtained
		
		
		// Method 1
		int marks =95;
	    
		if(marks >=90) 
		{
			System.out.println("Grade A");
		}
		else if(marks>70 && marks<90) 
		{
			System.out.println("Grade B");	
		}
		else if(marks>=50 && marks<=70) 
		{
			System.out.println("Grade C");	
		}
		else {
			System.out.println("Fail");
		}
			
	}

}
