package com.woniuxy.genericTypes;


public class Test {
	public static void main(String[] args) throws Exception {
		Object object = Class.forName("com.woniuxy.genericTypes.MyStack").getConstructor().newInstance();
		Object object1 = Class.forName("com.woniuxy.genericTypes.MyStack").getConstructor().newInstance();
		System.out.println(object);
		System.out.println(object1);
		
	}
	
}
