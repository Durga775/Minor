package com.best.practice;

import java.util.function.Function;
public class Functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("this is the main class");
            Function<String,Integer >  function= (String name) -> {
            	return name.length();
            };
            System.out.println(function.apply("Ram")); 
	}
}
