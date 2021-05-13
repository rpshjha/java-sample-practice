package globalLogic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateEmp {

	Set<Employee> uniqueEmp;

	public RemoveDuplicateEmp(List<Employee> emp) {

		this.uniqueEmp = new HashSet<>();
		uniqueEmp.addAll(emp);
	}

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "rupesh", 89993.2));
		emp.add(new Employee(2, "naveen", 88383.2));
		emp.add(new Employee(3, "anush", 1923.34));
		emp.add(new Employee(4, "anjana", 93382.2));
		emp.add(new Employee(5, "lucy", 348494.3));
		emp.add(new Employee(6, "sandeep", 29393.0));
		emp.add(new Employee(7, "ratnesh", 694.0));
		emp.add(new Employee(7, "ratnesh", 694.0));
		emp.add(new Employee(7, "ratnesh", 694.0));
		emp.add(new Employee(7, "ratnesh", 694.0));

		RemoveDuplicateEmp demo = new RemoveDuplicateEmp(emp);

		demo.uniqueEmp.stream().forEach(System.out::println);

	}

}
