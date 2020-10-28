package com.practise.jdk8.designpattern;

import java.util.HashMap;
import java.util.Map;

public class CommandDesignPattern {
	private Map<String, Handler> commandMap = new HashMap<>();
	private Map<Boolean, Handler> booleanCommandMap = new HashMap<>();
	
	public Map<String, Handler> initCommandMapHandler() {
		commandMap.put("condition One", new Handler() {
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

		commandMap.put("condition Four", (Object o) -> System.out.println("Come to the condition two..."));

		commandMap.put("condition Five", (Object o) -> {
			String data = o.toString();
			System.out.println("Come to the condition two..." + data);
		});

		return commandMap;
	}
	
	public  Map<Boolean, Handler> initBooleanCommandMap(){
		booleanCommandMap.put(true, (Object o) -> System.out.println("Inside true condition"));
		booleanCommandMap.put(false, (Object o) -> System.out.println("Come to the condition false..."));

		return booleanCommandMap;
	}

	public static void main(String[] args) {
		CommandDesignPattern object = new CommandDesignPattern();
		Map<String, Handler> initCommandMapHandler = object.initCommandMapHandler();

		initCommandMapHandler.get("conditionOne").handle(object);
	}
}
