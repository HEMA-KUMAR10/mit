package mit2;

import java.util.Scanner;

public class NumTriangle {

	 public static void printNT(int n) {
		  for(int i=1; i<=n; i++) {
			   for(int j=1; j<=n-i; j++) {
				    System.out.print(" ");
			   }
			   for(int j=1; j<=i; j++) {
				    System.out.print(j+" ");
			   }
			   System.out.println();
			  
	}
	 }
	 
	 
	 public static void main(String[] args) {
		int num;
		Scanner Sn = new Scanner(System.in);
		System.out.print("Enter the numbers to be present in the traingle: ");
		num = Sn.nextInt();
		printNT(num);
	}
}
