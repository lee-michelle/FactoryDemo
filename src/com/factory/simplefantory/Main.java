package com.factory.simplefantory;

/**
 * 简单工程模式（扩展性差） 用来生产同一等级结构中的任意产品，产品的创建由传入的参数决定。
 * 
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		// 生产IphoneX
		Iphone iphonex = IphoneFactory.produce("IphoneX");
		iphonex.paly();

		Iphone iphone8plus = IphoneFactory.produce("iphone8plus");
		iphone8plus.paly();

	}

}
