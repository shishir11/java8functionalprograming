package com.practise.jdk8.designpattern;

public enum SomeCondition {
	CONDITION_ONE("parameterOne"),

	CONDITION_TWO("parameterTwo");

	private final String parameter;

	private SomeCondition(String parameter) {
		this.parameter = parameter;
	}

	public String getParameter() {
		return parameter;
	}
}