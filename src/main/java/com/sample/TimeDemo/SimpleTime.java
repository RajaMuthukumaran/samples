package com.sample.TimeDemo;

import java.util.Date;

public class SimpleTime {

	public static void main(String[] args) {

		SimpleTime simpleTime = new SimpleTime();
		System.out.println(" The current Time is "+ simpleTime.getTime());
	}

	public Date getTime(){
		return new Date();
	}
}
