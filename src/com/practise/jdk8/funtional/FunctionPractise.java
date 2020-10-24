package com.practise.jdk8.funtional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * 
 * @author shishir.sarkar
 *
 */
public class FunctionPractise {
	/**
	 * Function interface is more of a generic one that takes one argument and produces a result. This has a Single Abstract Method
	 *  (SAM) apply which accepts an argument of a type T and produces a result of type R. One of the common use cases of this 
	 *  interface is Stream.map method.
	 * @param names
	 * @return
	 */
	final public List<Integer> calculateLengthOfGivenNameUsingFunction(final List<String> names){
	  //  List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
	    Function<String, Integer> nameMappingFunction = String::length;
	    return names.stream().map(nameMappingFunction).collect(Collectors.toList());
	   
	}
}
