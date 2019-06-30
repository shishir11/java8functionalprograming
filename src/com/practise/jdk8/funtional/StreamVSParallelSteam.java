package com.practise.jdk8.funtional;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class StreamVSParallelSteam {

	public static void main(String[] args) {
		WeakReference<List<Integer>> list = new WeakReference<>(new ArrayList<Integer>());
        for (int i = 0; i < 10000; i++) {
        	
            list.get().add(i);
        }
        long startTimeMillis = System.currentTimeMillis();
        list.get().stream().forEach(System.out::println);
        long endTimeMillis = System.currentTimeMillis();
         //With Parallel Stream
        list = new WeakReference<>(new ArrayList<Integer>());
        for (int i = 0; i < 10000; i++) {
            list.get().add(i);
        }
        long startTimeMillis2 = System.currentTimeMillis();
        list.get().parallelStream().forEach(System.out::println);
        long endTimeMillis2 = System.currentTimeMillis();
        
        System.out.println("Time taken in milli sec for Stream:"+(endTimeMillis-startTimeMillis));
        
        System.out.println("Time taken in milli sec for parallel Stream:"+(endTimeMillis2-startTimeMillis2));
	}

}
