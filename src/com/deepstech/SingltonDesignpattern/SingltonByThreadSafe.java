package com.deepstech.SingltonDesignpattern;

// If we want to work on Multithreaded environment

public class SingltonByThreadSafe {

	private static SingltonByThreadSafe instance;

	private SingltonByThreadSafe() {
	}

	/*
	 * public static synchronized SingltonByThreadSafe getInstance() { if (instance
	 * == null) { instance = new SingltonByThreadSafe(); } return instance;
	 * 
	 * }
	 */

	// To Avoid extra overhead we use Double checked locking

	public static SingltonByThreadSafe getInstanceUsingBoubleLocking() {
		if (instance == null) {
			synchronized (SingltonByThreadSafe.class) {
				if (instance == null) {

					instance = new SingltonByThreadSafe();
				}
			}
		}
		return instance;
	}
}
