/**
 * 
 */
package com.practise.jdk8.funtional.predicate.modular;

import java.util.List;

/**
 * @author Shishir Sarkars
 *
 */
public class PredicateWithModularity {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Employee> list = Employee.getEmpList();
		EmployeePredicate employeePredicate = new EmployeePredicate();
		System.out.println("using allMatch condition");
		System.out.println(list.stream().allMatch(employeePredicate.getPredicateOfEmployee1()));
		System.out.println(list.stream().allMatch(employeePredicate.getPredicateOfEmployee2()));
		System.out.println("using anyMatch");
		System.out.println(list.stream().anyMatch(employeePredicate.getPredicateOfEmployee1()));
		System.out.println(list.stream().anyMatch(employeePredicate.getPredicateOfEmployee2()));
		System.out.println(list.stream().anyMatch(e -> e.name.equalsIgnoreCase("Shishir")));
		System.out.println("using noneMatch");
		System.out.println(list.stream().noneMatch(employeePredicate.getPredicateOfEmployee1()));
		System.out.println("using anyMatch with complete functional ");
		System.out.println(list.stream().anyMatch(e -> e.name.equalsIgnoreCase("Shishir")));
	}

}

