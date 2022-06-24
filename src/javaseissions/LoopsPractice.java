package javaseissions;

public class LoopsPractice {

	public static void main(String[] args) {
		// WAP to print following output - 
		//I am Batman
		//I am Batman
		//I am Batman
		//I am Batman
		//I am Batman
		
		int i=0;
		while (i<5)
		{
			System.out.println("I am Batman");
			i++;
		}
		System.out.println("---------------------------");
		// WAP to print following output - 
				//I am Batman 1
				//I am Batman 2
				//I am Batman 3
				//I am Batman 4
				//I am Batman 5
		        //I am Batman 6
				//I am Batman 7
				//I am Batman 8
				//I am Batman 9
		
		int j=1;
		while (j<=9)
		{
			System.out.println("I am Batman "+j);
			j++;
		}
		
		System.out.println("---------------------------");
		
		// WAP to print 10 to 1 using for, while and do-while loop
		
		//While loop
		
		int k=10;
		while (k>=1)
		{
			System.out.println(k);
			k--;
		}
		System.out.println("---------------------------");
		
		// do while loop
		
		int l=10;
		do {
			System.out.println(l);
			l--;
		}
		while (l>=1);
	
	    System.out.println("---------------------------");
	    
	    // for loop 
	    
	    for (int m=10;m>=1;m--)
	    {
	    	System.out.println(m);
	    }
	    
	    System.out.println("---------------------------");
	    
	    //Write a program in Java to print "Hello World" ten times using while loop
	    
	    int n=1;
	    
	    while (n<=10)
	    {
	    	System.out.println("Hello World");
	    	n++;
	    }
	    
	    System.out.println("---------------------------");
	    
	    //Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
	    
	    
	    int o=1;
	    
	    while (o<=10)
	    {
	    	if(o%7==0) 
	    	{
	    		System.out.println("");	
	    	}
	    	else
	    	System.out.println(o);
	    	o++;
	    }
	    
	    System.out.println("---------------------------");
	    
	    
	    //Assignment 2 : Loop Assignment:
	   // Question 1: Write a program to print the following pattern using for loop:

	    	//00 01 02 03 04 05 06 07 08 09 
	    	//10 11 12 13 14 15 16 17 18 19 
	    	//20 21 22 23 24 25 26 27 28 29 
	    	//30 31 32 33 34 35 36 37 38 39 
	    
	    
	    for(int m =0;m<=3;m++) {
	    	for (int p=0;p<=9;p++) {
	    		System.out.print(m+""+p + " ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("---------------------------");
	    
	    
	    
	   // Array Assignment:
	    	//Question 2: Write a program to create a static Array, having following cricket data:
	    	//--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
	    	//--Try to create multiple Object Arrays for different players 
	    	//--Try to print all the values of each player on the console using normal for/while loop and for each loop
	    
	    
	    Object ob[] = new Object[7];
	    
	    ob[0]= "Virat";
	    ob[1]= 30;
	    ob[2]= "RCB";
	    ob[3]= 1992;
	    ob[4]= "Male";
	    ob[5]= 12.22;
	    ob[6]= true;
	    
	    for(k=0;k<ob.length;k++) {
	    	System.out.println(ob[k]);
	    }
	    System.out.println("---------------------------");
		for(Object e:ob) {
			System.out.println(e);
		}
		
		
		
}
	}