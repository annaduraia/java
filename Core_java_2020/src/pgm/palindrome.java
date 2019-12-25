package pgm;

import java.util.Scanner;

public class palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String inOrg;
		String rev="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter");
		inOrg = scanner.nextLine();
		 
	 
//		StringBuffer stringBuffer = new StringBuffer(inOrg);
//		rev = stringBuffer.reverse().toString();
		
		for (int i = inOrg.length()-1; i >=0; i--) {
			rev = rev+inOrg.charAt(i);
			
		}
		if(rev.equals(inOrg))
			System.out.println("Yes"+rev);
		else
			System.out.println("No"+inOrg);
		
		
//		char ch;
//		 
//	      for( ch = 'a' ; ch <= 'z' ; ch++ )
//	         System.out.println(ch);
		
	}

}
