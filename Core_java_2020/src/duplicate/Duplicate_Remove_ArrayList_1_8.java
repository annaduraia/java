package duplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_Remove_ArrayList_1_8 {
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
	
	    // it will remove duplicate object, It will check duplicate using equals method
	    List<Employee>  list2 =  list.stream().distinct().collect(Collectors.toList());
	    for (Employee employee : list2) {
			System.out.println("after : "+employee.getEmployeeId());
		}
	}
}
