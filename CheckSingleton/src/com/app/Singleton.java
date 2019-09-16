package com.app;

import java.lang.reflect.Constructor;

public class Singleton {
	private static Singleton sd = new Singleton();

	private Singleton() {
		System.out.println("object creating");
	}

	public static Singleton newInstance() {
		return sd;
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.newInstance();
		Singleton s2 = Singleton.newInstance();
		print("s1", s1);
		print("s2", s2);
		
		//Reflection
		Class clazz=Class.forName("com.app.Singleton");
	    Constructor<Singleton> ctor=clazz.getDeclaredConstructor();
	    ctor.setAccessible(true);
	    Singleton s3=ctor.newInstance();
	    print("s3",s3);
	    
		
	}

	static void print(String name, Singleton object) {
		System.out.println(String.format("object : %s, Hashcode : %d ", name, object.hashCode()));

	}

}
