package pgm;

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		int n,i,j, swap;
		
		System.out.println("enter total---");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		
		int array[]=new int[n];
		System.out.println("enter one by one---");
		for ( i = 0; i < n; i++) {
			array[i]=in.nextInt();
		}
		for (i = 0; i < (n-1); i++) {
			for (j = 0; j < n-i-1; j++) {
				if(array[j]>array[j+1])
				{
					swap = array[j];
					array[j] = array[j+1];
					array[j+1]=swap;
				}
			}
		}
		System.out.println("result");
		for (j = 0; j <n; j++) {
			System.out.println(array[j]);
			
		}
		
	}
}
