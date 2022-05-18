package com.oops;

public class Deskphone implements Telephone {
	
	private String myNumber;
	private boolean isRinging;
	
	
	public Deskphone(String myNumber) {
		this.myNumber=myNumber;
	}

	public void powerOn() {
		System.out.println("Deskphone is always powered up");
	}

	public void dial(String phoneNo) {
		System.out.println("Now Dialed phoneNumber:"+phoneNo+" from deskphone");
		
	}

	public void answer() {
		if(isRinging) {
			System.out.println("Answering the phone");	
			isRinging=false;
		}
		else {
			System.out.println("Phone is not ringing");		
		}
		
	}

	public boolean callPhone(String phoneNumber) {
	if(phoneNumber==myNumber) {
		isRinging=true;
		System.out.println("Phone ringing");		
	}else {
		isRinging=false;
	}
	return isRinging ;
	}

	public boolean isRinging() {
		
		return isRinging;
	}



}
