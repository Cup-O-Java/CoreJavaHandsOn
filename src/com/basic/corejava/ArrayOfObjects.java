//Example: To create Array Of Objects

package com.basic.corejava;

public class ArrayOfObjects {
	
	int a,b;
	
	public void setData(int x, int y) {
		a=x;
		b=y;
	}
	
	public void showData()	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void main(String[] args) {
		
		ArrayOfObjects obj[] = new ArrayOfObjects[2];
		
		obj[0] = new ArrayOfObjects();
		obj[1] = new ArrayOfObjects();
		
		obj[0].setData(2, 4);
		obj[1].setData(5, 8);
		
		System.out.println("After setData function.....");
		obj[0].showData();
		obj[1].showData();
	}

}

/* output - 
 * After setData function.....
a = 2
b = 4
a = 5
b = 8

 */
