//Pascal Triangle

package com.basic.corejava;

public class Pyramid4 {

	public static void main(String[] args) {
		
		int i, j, n=5, num = 1;
		
		for (i=0; i<n; i++) {
			for(j=n; j>i; j--) {
				System.out.print(" ");
			}
			num =1;
			for(int k=0; k<=i;k++) {
				System.out.print(num + " ");
				num = num * (i-k)/(k+1);
			}
			System.out.println();
		}

	}

}


/*


     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
 
 
 
*/