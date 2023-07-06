package constructorsSuper;
import java.math.BigDecimal;

public class Employee extends Person {
	//focusing only on the toString() method
	public String toString() {
		return String.format("Employee Name: %s, Email: %s, Phone Number: %s, Title: %s, Employer: %s, Employee Grade: %c, Salary: %s",
								super.getName(),
								super.getEmail(),
								super.getPhoneNumber(),
								title,
								employerName,
								employeeGrade,
								salary);
	}
}
