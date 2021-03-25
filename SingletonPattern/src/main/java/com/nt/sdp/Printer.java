package com.nt.sdp;

//minimum Standard  Singleton class

public class Printer {
	//Object should be private so that it cannot be created outside of the classs
	//private static Printer instance=new Printer();//Eager instantiation
	
	private static Printer instance;

	// Default 0 param constructor
	private Printer() 
	{
		System.out.println("0:: Param Private constructor");
	}
	
	
	/*Sol 1:= in a mutlithreaded Environment the singleton class fail
	 
	//We can get it correct by eager instantion
	
	public static Printer getInstance()
	{
		return instance; //it is a bad practice as object is created automatically without need
	}
    */
	
	
	/*
	Sol2:- We can make the factory method synchronized as every thread go single by single  not best
	
	public static synchronized Printer getInstance()
	{
		if(instance==null)
		{
			instance=new Printer();
		}	
		return instance;
	}
	*/
	
	/*Sol3:- instead of making full factory method we can use static block
	 * for the object creation
	 */
	
	public static Printer getInstance()
	{
		synchronized (Printer.class) {
			
			if(instance==null)
			{
				instance=new Printer();
			}
		}
		return instance;
	}
	
	
	
	
	
	 /*//Factory method for creation of object
	public static Printer getInstance()
	{
		if(instance==null)
		{
			instance=new Printer();
		}
		return instance;
	}*/
//b method
	public void Message(String msg)
	{
		System.out.println(msg);
	}
	
	
	

}
