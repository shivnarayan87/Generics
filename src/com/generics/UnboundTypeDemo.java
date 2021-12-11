package com.generics;

public class UnboundTypeDemo<T> {
	public void print(T t) {
		System.out.println(t.toString());
		
	}
	
	public static void main(String[] args) {
		UnboundTypeDemo<String> u= new UnboundTypeDemo<String>();
		u.print("shiv");
		UnboundTypeDemo<Integer> u1= new UnboundTypeDemo<Integer>();
		u1.print(10);
	}

}
