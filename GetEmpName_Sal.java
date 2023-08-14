package com.java8.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetEmpName_Sal {
	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(1, "kala", 22, "software", "test", 2022, 10000));
		al.add(new Employee(1, "ravi", 28, "software", "dev", 2021, 20000));
		
		Map<String, List<Employee>> out=al.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(out);
		
		out.forEach((name,salary) ->{
		salary.forEach(s -> System.out.println("EmpName EmpSal: " +s.getName() +" , "+ s.getSalary()));
		});
		
	}
}
