/**
 * 
 */
package com.practise.jdk8.funtional.predicate.modular;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author shishir
 *
 */
public class EmployeePredicate {

	/**
	 * Core logic encapsulate in predicate.. Predicate interface represents a
	 * boolean-valued-function of an argument. This is mainly used to filter data
	 * from a Java Stream.
	 * 
	 * @return
	 */
	public Predicate<Employee> getPredicateOfEmployee1() {
		return employee -> employee.id < 10 && employee.name.startsWith("A");
	}

	public Predicate<Employee> getPredicateOfEmployee2() {
		return employee -> employee.sal < 10000;
	}

	public List<String> filterListOfNamesUsingPredicate(List<String> names, String condition1, int condition2) {
		//List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
		Predicate<String> startPredicate = str -> str.startsWith(condition1);
		Predicate<String> lengthPredicate = str -> str.length() >= condition2;
		return names.stream().filter(startPredicate.and(lengthPredicate)).collect(Collectors.toList());
	}
}
