package com.best.practice;

import java.util.function.Consumer;

public class ConsumerInterface 
{
 public static void main(String[] args) {
	
	 Consumer<String> consumer = (String value) -> 
	 System.out.println(value);
	 consumer.accept("RamSeetha");
}
 
}
