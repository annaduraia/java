package pgm;

import java.util.Scanner;

public class ReverseInt {
	   //A method for reverse
	   public static void reverseMethod(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       }
	       else {
	           System.out.print(number % 10); //4, 3, 2, 1 
	           //Method is calling itself: recursion
	           reverseMethod(number/10);
	       }
	   }
	   public static void main(String args[])
	   {
		int num=0;
		System.out.println("Input your number and press enter: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.print("Reverse of the input number is:");
		reverseMethod(num);
		System.out.println();
	   }
}
