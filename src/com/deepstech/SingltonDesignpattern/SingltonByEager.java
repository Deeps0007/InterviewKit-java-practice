package com.deepstech.SingltonDesignpattern;

// This class is design using the EagerInitialization 
public class SingltonByEager {

	private static final SingltonByEager instance = new SingltonByEager();
	
	private SingltonByEager() {
		
	}
	
	
	public static SingltonByEager getInstance() {
		return instance;
	}
}
