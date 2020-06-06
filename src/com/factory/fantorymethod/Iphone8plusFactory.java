package com.factory.fantorymethod;

/**
 * 专门生产Iphon8plus的车间
 * 
 * @author Administrator
 *
 */
public class Iphone8plusFactory implements IphoneFactory {

	@Override
	public Iphone produce() {
		return new IphoneX8plus();
	}

}
