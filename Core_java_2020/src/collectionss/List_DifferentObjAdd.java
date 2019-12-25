package collectionss;

import java.util.ArrayList;
import java.util.List;

public class List_DifferentObjAdd
{
    public static void main (String[] args)
    {
        // ----------Different object need to add in single list ----------------------

        List<Employee> empList = new ArrayList<Employee> ();
        List<Student> stdList = new ArrayList<Student> ();
        List<List< ? >> resList = new ArrayList<List< ? >> ();
        Employee employee = new Employee (1l, "eName");
        Student student = new Student (2l, "sName");
        empList.add (employee);
        stdList.add (student);
        resList.add (empList);
        resList.add (stdList);

        for (List< ? > list : resList)
        {
            for (Object object : list)
            {
                if (object instanceof Employee)
                {
                    Employee employee2 = (Employee) object;
                    employee2.seteName ("ass");
                    System.out.println (((Employee) object).geteName ());
                }
                else
                    System.out.println (((Student) object).getsName ());
            }
        }
        List resultList = new ArrayList ();
        resultList.add (employee);
        resultList.add (student);
        for (Object object : resultList)
        {
            if (object instanceof Employee)
            {
                Employee emp = (Employee) object;
                System.out.println ("Employee : "+emp.geteName ());
            }
            else if (object instanceof Student)
            {
                Student emp = (Student) object;
                System.out.println ("Student :"+emp.getsName ());
            }
            else
            {
                System.out.println (Integer.parseInt (object.toString ()));
            }
        }

    }

}
