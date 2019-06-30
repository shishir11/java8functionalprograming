package com.practise.jdk8.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list = null;
		System.out.println(Optional.ofNullable(list));
		list = Arrays.asList("Java", "Scala", "JQuery");
		Optional.ofNullable(list).ifPresent(record -> {
			record.get(0);
		});
		list = Arrays.asList("Java", "Scala", "JQuery");
		
		
		Optional.of(list).filter(record -> record.contains("Java")).get().forEach(System.out::println);

		Optional.ofNullable(list).filter(record -> record.contains("Scala")).get().forEach(data -> {
			System.out.println(data);
		});

		list = null;
		if (Optional.ofNullable(list).isPresent()) {
			for (String s : list) {
				if (s.contains("Scala")) {
					System.out.println(s);
				}
			}
		}
	}
}
