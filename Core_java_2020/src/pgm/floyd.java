package pgm;

import java.util.Iterator;
import java.util.Scanner;

public class floyd {
	public static void main(String[] args) {
		int n, num=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter");
		n= scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		for (int c = 1; c <= n; c++) {
			for (int d = 1; d <=c; d++) {
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}

	
}
