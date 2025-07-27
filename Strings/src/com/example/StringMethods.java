package com.example;

public class StringMethods {
	public static void main(String[] args) {
		
		StringMethods sm=new StringMethods();
		
		sm.findLength();
		sm.printCharAt();
		sm.printCharAtIndex("Rajkumar",3);
		
		sm.checkForEmpty("");
		
		boolean result=sm.checkForBlank("   ");
		
		System.out.println(result);
		
		sm.checkEqualsWithoutCase("Raj", "raj");
		
		sm.checkContains("Raj", "rajRaj");
		
		sm.checkStatingWith("Raj", "Rajkumar");
		
		sm.findIndex("Rajkumar");
	}
	
	void findLength() {
		String s="Raj";
		System.out.println(s.length());
	}
	
	//raw input
	void printCharAt() {
		String s="Rajkumar";
		System.out.println(s.charAt(4));
	}
	
	void printCharAtIndex(String s,int index) {
		
		 System.out.println(s.charAt(index));
	}
	
	void checkForEmpty(String s) {
		System.out.println(s.isEmpty());
	}
	
    boolean checkForBlank(String s) {
    	boolean c=s.isBlank();
    	return c;
    }
    
    void checkEqualsWithoutCase(String s1,String s2) {
    	System.out.println(s1.equalsIgnoreCase(s2));
    }
    
    void checkContains(String s1,String s2) {
    	System.out.println(s2.contains(s1));
    }
    
    void checkStatingWith(String s1,String s2) {
    	System.out.println(s2.startsWith(s1));
    }
    
    void findIndex(String s) {
    	System.out.println(s.indexOf('a'));
    	System.out.println(s.lastIndexOf('a'));
    }
    
}
