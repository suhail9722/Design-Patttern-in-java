package com.nt.test;

public class SingletonTest1_Mutithreaded {

	public static void main(String[] args) {
		
		//creates threads having Servlet class obj as data
		TicketBookingServlet sevlet=new TicketBookingServlet();
		Thread t1=new Thread(sevlet);
		Thread t2=new Thread(sevlet);
		Thread t3=new Thread(sevlet);
		
		t1.start();
		t2.start();
		t3.start();
		
	}//main

}
