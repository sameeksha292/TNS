package com.tnsif.Generics;

public class GenericMethodDemo {
	public static<T> void displayArray(T[] array) {
		//for(returntype varname:arrayname)
		for(T i:array) {
			System.out.println("Array elements"+i);
		}
	}

}
