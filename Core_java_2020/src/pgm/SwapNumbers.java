package pgm;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String args[])
	   {
	      int x, y, temp;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	      
	      int a=1,b=2;	      
	      a=a+b;
	      b=a-b;
	      a=a-b;
	      System.out.println(a+""+b);
	   }
}
