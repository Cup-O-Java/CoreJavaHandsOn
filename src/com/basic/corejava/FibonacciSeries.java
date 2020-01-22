package com.basic.corejava;

import java.util.Scanner;

public class FibonacciSeries {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int n;
		int startNumber = 0;
		int nextNumber = 1;
		
		System.out.print("Enter n number of series - ");
		sc = new Scanner(System.in);
		n = sc.nextInt();
				
		for(int i=0; i<=n; i++) {
			
			System.out.println(startNumber+" ");
			
			int sum = startNumber + nextNumber ;
			startNumber = nextNumber ;
			nextNumber = sum ;
			
		}
	}

}

/*
o/p  - 
Enter n number of series - 10
0 
1 
1 
2 
3 
5 
8 
13 
21 
34 
55 

*/