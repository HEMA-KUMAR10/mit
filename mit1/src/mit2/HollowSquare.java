package mit2;

import java.util.*;

public class HollowSquare {
	public static void printSq(int n) {
		 for(int i=0; i<n; i++) {
			  for( int j=0; j<n; j++) {
				   if(i==0||j==0||i==n-1||j==n-1) {
					    System.out.print("*"+" ");
					     }
				   else {
					    System.out.print(" "+" ");
				   }
			  }
			  System.out.println();
			  
		 }
	}
	
	public static void main(String[] args) {
		int num;
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the number of lines to be in the square: ");
		num = sn.nextInt();
		printSq(num);
	    
		
	}
}
