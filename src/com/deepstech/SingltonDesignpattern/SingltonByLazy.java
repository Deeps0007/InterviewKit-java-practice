package com.deepstech.SingltonDesignpattern;

// Lazy Initialization
public class SingltonByLazy {

	private static SingltonByLazy instance;

	private SingltonByLazy() {
	}

	public static SingltonByLazy getInstance() {
		if (instance == null) {
			instance = new SingltonByLazy();
		}
		return instance;

	}

}
