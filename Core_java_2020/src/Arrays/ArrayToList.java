package Arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayToList
{

    public static void main (String[] args)
    {

        String[] str = {"A", "B", "C"};
        List<String> list = Arrays.asList (str);// Array To List
        System.out.println (list);
        Arrays.copyOf (str, 10);// Copy of Array
        String[] newArr = Arrays.copyOfRange (str, 1, 4); // copy of range
        String[] str1 = {"A", "B", "C"};
        System.out.println (Arrays.deepEquals (str, str1));// Array are equal
        // Arrays.fill() helps us to fill an empty array with default values.
        String[] myArr = new String[10];
        Arrays.fill (myArr, "Assigned");
        // Array Sort
        Integer[] arrList = {1, 2, 4, 35, 345, 11, 10};
        Arrays.sort (arrList);
        for (Integer integer : arrList)
        {
            System.out.println (integer);
        }
        // Sort using Comparator Array
        Arrays.sort (str, new Comparator<String> ()
        {

            @Override
            public int compare (String arg0, String arg1)
            {
                // TODO Auto-generated method stub
                return arg0.compareTo (arg1);
            }
        });
        for (Integer integer : arrList)
        {

        }
        System.out.println ("Comparator----------" + str);
        // /convert String to Integer
        String s1 = "34";
        Integer s11 = Integer.valueOf (s1);
        System.out.println (s11);
        String str11 = "adef";
        Integer i = Integer.parseInt (str11, 27);
        System.out.println ("Integer value: " + i);

        // 8043811013 covenent
        ProcessBuilder pb = new ProcessBuilder ("java", "mapSeap");
        try
        {
            pb.start ();
            System.out.println ("Process has been started.");
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace ();
        }
    }

}
