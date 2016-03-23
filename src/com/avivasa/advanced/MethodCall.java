package com.avivasa.advanced;

import java.lang.reflect.Method;
public class MethodCall{
public static void main(String[] args)throws Exception{

	Class c = Class.forName("com.avivasa.advanced.A");
	Object o= c.newInstance();
	
	Method m =c.getDeclaredMethod("message", com.avivasa.advanced.B.class);
	m.setAccessible(true);
	m.invoke(o, new B());
}
}
