package pgm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int n, swap;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter");
//		n = in.nextInt();
//
//		int array[] = new int[n];
//		System.out.println("enter  " + n + "  Numbers");
//		for (int i = 0; i < n; i++) {
//			array[i] = in.nextInt();
//		}
		int array[] = {100,50,110,20};
		for (int i = 0; i < (4-1); i++) {
			for (int j = 0; j < (4-1-i); j++) {
				if(array[j]> array[j+1])
				{
					swap = array[j];
					array[j] = array[j+1];
					array[j+1]= swap;
				}
			}
		}
		System.out.println("Result");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//Array Sort
		 String[] strings = new String[] {"23","32","22"}; 
		 Arrays.sort(strings);
		 for (String stringa : strings) {
			System.out.println(stringa);
		}
		 
		 List<String> list = new ArrayList<String>();
		 list.add("44");
		 list.add("4");
		 list.add("444");
		 Collections.sort(list);
		 for (String string : list) {
			System.out.println(string);
		}
		
	}
}
