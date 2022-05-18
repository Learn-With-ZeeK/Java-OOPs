package com.oops;

public interface Telephone {

	//power on
	//dial a number
	//answer phone call
	//call another phone 
	 //is ringing
	
	void powerOn();
	void dial(String phoneNo);
	void answer();
	boolean callPhone(String phoneNo);
	boolean isRinging();
	
}
