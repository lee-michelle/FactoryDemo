package com.factory.fantorymethod;

/**
 * 专门生产X的车间
 * 
 * @author Administrator
 *
 */
public class IphoneXFactory implements IphoneFactory {

	@Override
	public Iphone produce() {
		return new IphoneX();
	}

}
