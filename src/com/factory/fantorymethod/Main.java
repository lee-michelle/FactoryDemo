package com.factory.fantorymethod;

/**
 * 工厂方法模式 用来生产同一等级结构中的固定产品，一个工厂只能生产一个固定产品
 * 
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		IphoneXFactory iphoneXFactory = new IphoneXFactory();
		Iphone iphoneX = iphoneXFactory.produce();
		iphoneX.paly();
	}
}
