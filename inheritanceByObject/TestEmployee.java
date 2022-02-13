package inheritanceByObject;

public class TestEmployee
{
	 public static void main(String[] args) 
	 {
	        Employee emp = new Employee();
	        System.out.println("Employee Id : " + emp.empId);
	        System.out.println("Employee Name : " + emp.empName);
	        Employee emp2 = new Employee(101, "Kumaresh");
	        System.out.println("Employee Id : " + emp2.empId);
	        System.out.println("Employee Name : " + emp2.empName);
	    }
}
