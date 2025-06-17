package com.zubair.pers;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {

	public static void main(String[] args) throws Exception {
		
//		Person p = new Person("Sam", 23);
//		Class pc = p.getClass();
		
		String className = "com.zubair.pers.Person";
		Class pc = null;
		
		// forName loads a class into memory manually
		pc = Class.forName(className);
		
		System.out.println(pc);
		
		Constructor[] constructors = pc.getConstructors();
		System.out.println("-- List of constructors");
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		
		// Logic for dynamically instantiating a class
		Object pObj = constructors[0].newInstance(null);
		System.out.println(pObj);
		
		// Logic to dynamically invoke print method on object
		Method printMethod = pc.getMethod("print", null);
		printMethod.invoke(pObj, null);
				
		// Logic to dynamically invoke private test method on object
		Method testMethod = pc.getDeclaredMethod("test", null);
		testMethod.setAccessible(true);
		testMethod.invoke(pObj, null);
		
		Method[] methods = pc.getMethods();
		System.out.println("-- List of methods");
		for (Method m : methods) {
			System.out.println(m);
		}
		
		Method[] decMethods = pc.getDeclaredMethods();
		System.out.println("-- List of declared methods");
		for (Method m : decMethods) {
			System.out.println(m);
		}
		
		Field[] fields = pc.getDeclaredFields();
		System.out.println("-- List of fields");
		for (Field f : fields) {
			System.out.println(f);
		}
	}
}
