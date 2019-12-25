package duplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicate_Remove_ArrayList {
	public static void main(String[] args) {
		Employee hr = new Employee(1, "HR");
	    Employee hrDuplicate = new Employee(1, "HR");       // Duplicate Object
	    Employee teamLeader = new Employee(2, "Team Leader");
	
	    List<Employee> list=new ArrayList<>();
	    list.add(hr);
	    list.add(hrDuplicate);
	    list.add(teamLeader);
	    System.out.println("Employee List(Duplicate)");
	    for (Employee employee : list) {
	        System.out.println(employee.getEmployeeName());
	    }
	
	    HashSet<Employee> hashSet = new HashSet(list);      // create has set. Set will contains only unique objects
	
	    System.out.println("Employee List(Unique)");
	    for (Employee employee : hashSet) {
	        System.out.println(employee.getEmployeeName());
	    }
	}
}
