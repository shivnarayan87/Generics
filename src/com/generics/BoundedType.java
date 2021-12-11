package com.generics;

public class BoundedType<T extends Number> {
	public void sum(T t) {
		System.out.println(t.toString());
		
	}
	
	public static void main(String[] args) {
		BoundedType<Number> b= new BoundedType<Number>();
		BoundedType<Integer> b1= new BoundedType<Integer>();
		b.sum(10);
		
	}

}
