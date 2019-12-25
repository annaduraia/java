package collectionss.comparable;

/**
 * Comparable interface is used to order the objects of user-defined class. This interface is found in java.lang package
 * and contains only one method named compareTo(Object).It provide only single sorting sequence i.e. you can sort the
 * elements on based on single datamember only. For instance it may be either rollno,name,age or anything else.
 * 
 * @author annadurai_a
 * 
 */
public class Student implements Comparable<Object>
{
    int    rollno;
    String name;
    int    age;

    Student (int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo (Object obj)
    {
        Student st = (Student) obj;
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }

}
