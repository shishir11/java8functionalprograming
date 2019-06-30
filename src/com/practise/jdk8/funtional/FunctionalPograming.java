package com.practise.jdk8.funtional;

import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FunctionalPograming {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// List<String> list = Arrays.asList("shishir", "sarkar", "student become developer");
		SoftReference<List<String>> list = new SoftReference<List<String>>(
				Arrays.asList("shishir", "sarkar", "student become developer"));
		// Predicate is data -> data.equalsIgnoreCase("Shishir")
		System.out.println("Any match: " + list.get().stream().anyMatch(data -> data.equalsIgnoreCase("shishir")));

		// Predicate is data -> data.contains("s")
		Optional.ofNullable(list.get())
				.ifPresent(list1 -> list1.stream().filter(data -> data.contains("s")).forEach(print -> {
					System.out.println("filter: " + print);
				}));

		Optional.ofNullable(list.get()).ifPresent(record -> System.out.println(
				"Find Any: " + record.stream().filter(data -> data.length() > 3).findAny().orElse("No Data found")));

		Optional.ofNullable(list.get())
				.ifPresent(record -> record.parallelStream().filter(data -> data.endsWith("become developer")).findAny()
						.ifPresent(data -> System.out.println(" find any with if present" + data)));

		System.out.println(
				"its matching the condition it is match than it create the fresh list out of this matching condition...");
		list.get().stream().filter(data -> data.contains("s")).collect(Collectors.toList()).forEach(System.out::print);

		System.out.println("Map we can use whe we need to append the information in the existing list, should we say"
				+ "that for transform the record...");
		list.get().stream().map(data -> data.concat("!!")).collect(Collectors.toList()).forEach(System.out::println);

		list.get().parallelStream().filter(data -> !data.contains(" developer")).collect(Collectors.toList()).stream()
				.map(data -> data.concat(" become functional prgrammer")).collect(Collectors.toList())
				.forEach(System.out::println);

		list.get().parallelStream().filter(data -> !data.contains(" developer")).collect(Collectors.toList()).stream()
				.map(data -> data.concat(" become functional prgrammer"))
				.reduce((data1, data2) -> data1 + "and " + data2);

		// below statement check both null and empty check
		Collection<String> collectList = new LinkedList<>();
		Optional.ofNullable(list).ifPresent(data -> {
			collectList.add(
					data.get().parallelStream().map(data1 -> data1.toUpperCase()).reduce((a, b) -> a + " " + b).get());
		});

		
	}

}
