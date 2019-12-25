package pgm;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        System.out.println(+n%2);
        if(n%2==1 || ( (n%2==0) && (n>=6 && n <= 20 ) ) ){
          ans = "Weird";
        }
        else{
            ans = "Not Weird";
           //Complete the code

        }
        System.out.println(ans);

    }
}
