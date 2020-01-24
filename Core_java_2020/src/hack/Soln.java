package hack;

import java.util.Arrays;
import java.util.Scanner;

public class Soln {

 public static void main(String[] args) {
	 
	 Scanner s = new Scanner(System.in);

     int count = s.nextInt();
     s.nextLine(); // throw away the newline.
     
     int [] numbers = new int[count];
     Scanner numScanner = new Scanner(s.nextLine());
     for (int i = 0; i < count; i++) {
         if (numScanner.hasNextInt()) {
             numbers[i] = numScanner.nextInt();
         } else {
             System.out.println("You didn't provide enough numbers");
             break;
         }
     }
     
     for (int i = 0; i < count; i++) {
    	 for (int j = 1; j <= numbers[i]; j++) {
    		 if(j%3 == 0 && j%5 == 0)
    			 System.out.println("FizzBuzz");
    		 else if(j%3 == 0)
    			 System.out.println("Fizz");
    		 else if (j%5 == 0) 
    			 System.out.println("Buzz");
    		 else
    			 System.out.println(j);
				
			}
			
		}
		
	}

     
     
     
 }
