package com.factory.simplefantory;

public class IphoneFactory {
	public static Iphone produce(String model) {
		if ("IphoneX".equalsIgnoreCase(model)) {
			// System.out.println("生产IphoneX");
			return new IphoneX();
		} else if ("Iphone8plus".equalsIgnoreCase(model)) {
			// System.out.println("生产Iphone8plus");
			return new IphoneX8plus();
		}
		return null;
	}

}
