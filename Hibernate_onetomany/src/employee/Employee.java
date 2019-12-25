package employee;

import java.util.HashSet;
import java.util.Set;


	@SuppressWarnings("serial")
	public class Employee implements java.io.Serializable {

		private long employeeId;
		private String employeeName;
		private Set<Account> employeeAccountNumbers = new HashSet<Account>(0);

		public Employee() {
		}

		public Employee(String employeeName) {
			this.employeeName = employeeName;
		}

		public Employee(String employeeName, Set<Account> employeeAccountNumbers) {
			this.employeeName = employeeName;
			this.employeeAccountNumbers = employeeAccountNumbers;
		}

		public Set<Account> getEmployeeAccountNumbers() {
			return employeeAccountNumbers;
		}

		public void setEmployeeAccountNumbers(Set<Account> employeeAccountNumbers) {
			this.employeeAccountNumbers = employeeAccountNumbers;
		}

		public long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(long employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
}
