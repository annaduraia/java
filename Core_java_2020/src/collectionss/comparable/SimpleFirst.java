package collectionss.comparable;

import java.util.*;
import java.io.*;

class SimpleFirst
{
    public static void main (String args[])
    {

        ArrayList al = new ArrayList ();
        al.add (new Student (101, "Vijay", 23));
        al.add (new Student (106, "Ajay", 27));
        al.add (new Student (105, "Jai", 21));

        Collections.sort (al);
        Iterator itr = al.iterator ();
        while (itr.hasNext ())
        {
            Student st = (Student) itr.next ();
            System.out.println (st.rollno + "" + st.name + "" + st.age);
        }
    }
}
