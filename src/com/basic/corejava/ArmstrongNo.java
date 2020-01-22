package com.basic.corejava;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String args[])
	{
		int num, length=0;
		System.out.print("Enter number to check Armstrong - ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int t1 = num;
		
		while(t1!=0) // checked the length of number
		{
			length = length + 1;
			t1=t1 / 10;
		}
		
		//System.out.println(length);
		
		int t2 = num;
		int rem, arm = 0;
		
		while(t2!=0) // reverse a number and multiply itself for 3 times(cube)
		{
			int mul = 1;
			rem=t2 % 10;
			
			for(int i=0; i<length ; i++) {
				mul = mul * rem ; 
			}			
			arm = arm + mul;
			t2 = t2 /10;
		}
		System.out.println(arm);
		if(num == arm) {
			System.out.println("Number is Armstrong....");
		}
		else {
			System.out.println("Number is not Armstrong...");
		}
				
	}
}
