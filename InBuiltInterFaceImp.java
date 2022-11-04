package com.basic.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class InBuiltInterFaceImp {
	public static void main(String[] args) {
		
		//Functional Interface Implementation
		Function<String , String > fn=(str)->{return str.toUpperCase();};
		String apply = fn.apply("Jai Mata Tulsi");
		System.out.println(apply);
		
		//Consumer Interface Implementation
		Consumer<String> cs=(data)->{System.out.println(data);};
		cs.accept("Jai Deva");
		
		//Predicate Interface Implementation
		Predicate<String> pre=(s)->{return s.equals("yana");};
		boolean test = pre.test("yana");
		System.out.println(test);
		
		//Supplier Interface Implementation
		Supplier<String> sp=()->{return "jai mata di";};
		String val = sp.get();
		System.out.println(val);
		
	}

}
