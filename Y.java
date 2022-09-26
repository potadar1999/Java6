package com.inter;

public interface Y {
	
    public abstract void C1();
	
	public default void C2() {
		System.out.println("I'm inside the Y class of C2");
	}
		 
	 
	 
	public static void C3() {
		System.out.println("I'm inside the Y class of C3");
		
		 
	 }
	
	
	

}
