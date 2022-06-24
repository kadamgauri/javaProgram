package javaseissions;

public class DataTypes {

	public static void main(String[] args) {
	// Data types
	//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
	//Expected Output :
	//Hello 
	//Naveen K
		
		System.out.println("Hello" +"\n"+ "Naveen k");
		
		System.out.println("-----------------------");
		//method 2
		
		String a = "Hello";
		String b = "Naveen k";
		System.out.println(a +"\n"+ b);
		System.out.println("-----------------------");
		
	//2. Write a Java program to print the sum of two numbers. 
	//Test Data: 74 + 36 
	//Expected Output :110
		
		int c = 74;
		int d = 36;
		System.out.println(c + d);
		System.out.println("-----------");
		
		// Method 2
		System.out.println(74 + 36);
		System.out.println("-----------");
		
		
	//3. Write a Java program to divide two numbers and print on the screen. 
	//Test Data : 50/3
	//Expected Output :16

		int e = 50;
		int f = 3;
		System.out.println(e/f);
		System.out.println("-----------");
		
	// Method 2
		System.out.println(50/3);
		System.out.println("-----------");
		
		
	//Write a Java program to print the result of the following operations. Change your test data accordingly.
	//Test Data:
	//a. -5 + 8 * 6
	//b. (55+9) % 9 
	//c. 20 + -3*5 / 8 
	//d. 5 + 15 / 3 * 2 - 8 % 3 
	//Expected Output :
	//43 
	//1 
	//19 
	//13
		
		//method 1
		
		int g= 5;
		int h=8;
		int i=6;
		
		System.out.println(-(g)+h*6);
		
		System.out.println("-----------");
		// OR
		System.out.println(-(5)+8*6);

		System.out.println("-----------");
		
		int j =55;
		int k = 9;
		System.out.println((j+k)%k);
		System.out.println("-----------");
		
		//OR
		System.out.println((55+9) % 9);
		System.out.println("-----------");
		
		
		int l =20;
		int m = -3;
		int n = 5;
		int p = 8;
		System.out.println(l+m*n/p);
		System.out.println("-----------");
		
		//OR
		System.out.println(20 + -3*5 / 8);
		System.out.println("-----------");
		
		int q = 15;
		int r = 3;
		int s = 2;
		System.out.println(n+q/r*s - p%r);
		System.out.println("-----------");
		
		
		//OR
		System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
		System.out.println("-----------");
		
	//Write a Java program to compute the specified expressions and print the output. Go to the editor
	//Test Data:
	//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
	//Expected Output
	//2.138888888888889
	
		double f1 = 25.5;
		double f2 = 3.5;
		double f3 = 40.5;
		double f4 = 4.5;
		
		System.out.println((f1*f2 - f2*f2) / (f3 - f4));
		System.out.println("-----------");
		
	    //OR
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
		System.out.println("-----------");
		
	//6. Try to concat "Hello Selenium" with a character 't'.
		
		
		
	//7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
	//	"Your Total amount is. 3700".	
	
		int s1 =100;
		int t = 200;
		int u =3400;
		int Total = s1 + t + u;
		
		System.out.println("Your Total amount is." +Total);
		System.out.println("-----------");
		
	// What should be the output for :byte b3 = 065; System.out.println(b3);
		
		byte b3 = 065; 
		System.out.println(b3);
		System.out.println("-----------");
		
   // The output is 53 because this is octal number(the number which starting with zero)
			
		
	}

}
