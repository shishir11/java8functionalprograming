package com.practise.jdk8.funtional;

interface Workable{
	public String doWorking();
	
	
}
public class FunctionalInterfaceExample implements Workable{

	public static void main(String[] args) {
		Workable work = () ->{
			return "Lets see how it work...";
			
		};
		
		work.doWorking();
		
	}

	@Override
	public String doWorking() {
		return "TODO Auto-generated method stub";
		
	}


}
