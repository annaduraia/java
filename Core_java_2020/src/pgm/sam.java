package pgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String original, reverse="", temp = "Hai, madam mam my name is Annadurai";
		
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	      
	      StringBuffer stringBuffer = new StringBuffer(original);
	      
	      reverse = stringBuffer.reverse().toString();
	 
	      /*int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);*/
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	      
	      String[] strings = temp.split(" ");
	      List<String> palStr = new ArrayList<String>();
	      for(String str:strings)
	      {
	    	  str = str.replaceAll(",", "");
	    	  StringBuffer stringBuffer1 = new StringBuffer(str);
		      reverse = stringBuffer1.reverse().toString();
		      
		      if(str.equals(reverse))
		    	  palStr.add(str+"   "+reverse);
		      else
		    	  System.out.println(str+"   "+reverse);
		      
	      }
	      System.out.println("the palindrome are,");
	      for(String str:palStr)
	    	  System.out.println(str);
	}

}
