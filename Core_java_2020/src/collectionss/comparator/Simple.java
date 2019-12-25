package collectionss.comparator;

import java.util.*;
import java.io.*;

class Simple
{
    /**
     *  Comparator interface is used to order the objects of user-defined class.
        This interface is found in java.util package and contains 2 
        methods compare(Object obj1,Object obj2) and equals(Object element).
        
        It provides multiple sorting sequence i.e. you can sort the elements 
        based on any data member. For instance it may be on rollno, name, age or 
        anything else.
     
     */
    @SuppressWarnings("unchecked")
    public static void main (String args[])
    {

        ArrayList<Student> al = new ArrayList<Student> ();
        al.add (new Student (101, "Vijay", 23));
        al.add (new Student (106, "Ajay", 27));
        al.add (new Student (105, "Jai", 21));

        System.out.println ("Sorting by Name...");

        Collections.sort (al, new NameComparator ());
        Iterator<Student> itr = al.iterator ();
        while (itr.hasNext ())
        {
            Student st = (Student) itr.next ();
            System.out.println (st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println ("sorting by age...");

        Collections.sort (al, new AgeComparator ());
        Iterator<Student> itr2 = al.iterator ();
        while (itr2.hasNext ())
        {
            Student st = (Student) itr2.next ();
            System.out.println (st.rollno + " " + st.name + " " + st.age);
        }


    }
}
