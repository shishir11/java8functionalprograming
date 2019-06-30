/**
 * 
 */
package com.practise.jdk8.funtional.predicate.modular;

import java.util.function.Predicate;


/**
 * @author shishir
 *
 */
public class EmployeePredicate {

	/**
	 * Core logic encapsulate in predicate..
	 * 
	 * @return
	 */
	public  Predicate<Employee> getPredicateOfEmployee1() {
		return employee -> employee.id < 10 && employee.name.startsWith("A");
	}

	public  Predicate<Employee> getPredicateOfEmployee2() {
		return employee -> employee.sal < 10000;
	}
}


