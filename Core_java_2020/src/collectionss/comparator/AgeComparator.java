package collectionss.comparator;

import java.util.*;

public class AgeComparator implements Comparator<Object>
{
    @Override
    public int compare (Object o1, Object o2)
    {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}
