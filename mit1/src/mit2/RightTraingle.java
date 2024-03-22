package mit2;

import java.util.Scanner;

public class RightTraingle {
	
	public static void printRT(int n) {
	 for(int i=1; i<=n; i++) {
			  for(int j=1; j<=n; j++) {
				   if(j<=i) {
					    System.out.print("*"+" ");
			
			  }
			  } System.out.println();
		 }
	}
	
	public static void main(String[] args) {
		int num;
		Scanner Sn = new Scanner (System.in);
		System.out.print("Enter the number of lines to be in the triangle: ");
		num = Sn.nextInt();
		printRT(num);
	}

}
