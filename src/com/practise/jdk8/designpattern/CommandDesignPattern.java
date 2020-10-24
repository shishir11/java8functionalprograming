package com.practise.jdk8.designpattern;

import java.util.HashMap;
import java.util.Map;

public class CommandDesignPattern {

	public static void main(String[] args) {
		CommandDesignPattern object = new CommandDesignPattern();
		Map<String, Handler> commandMap = new HashMap<>();
		commandMap.put("conditionOne", new Handler() {
			@Override
			public void handle(Object o) {
				System.out.println("Come to the condition one...");

			}
		});

		commandMap.put("condition Two", new Handler() {
			@Override
			public void handle(Object o) {
				System.out.println("Come to the condition two...");
			}
		});

		commandMap.put("condition Three", new Handler() {
			@Override
			public void handle(Object o) {
				System.out.println("Come to the condition two...");
			}
		});

		commandMap.get("conditionOne").handle(object);
	}
}
