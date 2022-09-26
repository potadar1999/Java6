package com.inter;

public interface X {

	public abstract void D1 ();
	
	public default void D2() {
		System.out.println("I'm inside the X class of D2");
	}
		 
	 
	 
	public static void D3() {
		System.out.println("I'm inside the X class of D3");
		 
	 }
	
	
}
