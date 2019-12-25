package junits;


import java.util.ArrayList;
import java.util.List;

public class Employee {

   private String name;
   private int empId;
   private int salary;
    
   public Employee(int id, String name, int sal){
       this.empId = id;
       this.name = name;
       this.salary = sal;
   }
    
   public boolean equals(Object obj){
       Employee emp = (Employee) obj;
       boolean status = false;
       if(this.name.equalsIgnoreCase(emp.name)
               && this.empId == emp.empId 
               && this.salary == emp.salary){
           status = true;
       }
       return status;
   }
    
   public static String getEmpNameWithHighestSalary(){
       /**
        * logic to get Highest paid employee
        */
       return "Nattu";
   }
    
   public static Employee getHighestPaidEmployee(){
       /**
        * hiding logic to get highest paid employee
        */
       return new Employee(1, "Nattu", 15000);
   }
    
   public int hashCode(){
       return this.empId;
   }
    
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public int getEmpId() {
       return empId;
   }
   public void setEmpId(int empId) {
       this.empId = empId;
   }
   public int getSalary() {
       return salary;
   }
   public void setSalary(int salary) {
       this.salary = salary;
   }
}