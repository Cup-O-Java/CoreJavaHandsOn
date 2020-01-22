package com.basic.corejava;

public class Pyramid1 {

	public static void main(String[] args) {
		 
		int i , j;
		
		for (i=0; i<=5; i++)
		{
			for(j=1 ; j<=i ; j++)
			{
				//1)
				//System.out.print("* ");
				//2)
				//System.out.println(i);
				//3)
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}

/*

1)

*  
* *  
* * *  
* * * *  
* * * * *  



2)

1 
22 
333 
4444 
55555 


3)

1 
12 
123 
1234 
12345 


*/