package com.basic.corejava;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		int n, num, last, rev=0;
		
		System.out.print("Enter a number to check palindrome - ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		
		while(num>0) {
			last = num % 10; // reminder
			System.out.println("reverse num - "+last);
			rev = (rev*10) + last ;
			num = num /10;
		}
		
		System.out.println(rev);
		
		if(n == rev) {
			System.out.println("Number is palindrome....");
		}
		else {
			System.out.println("Number is not palindrome....");
		}
	}
}

/* output - 
 * Enter a number to check palindrome - 121
reverse num - 1
reverse num - 2
reverse num - 1
121
Number is palindrome....
 * 
 */
