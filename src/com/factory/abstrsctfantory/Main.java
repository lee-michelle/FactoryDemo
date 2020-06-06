package com.factory.abstrsctfantory;

/**
 * 抽象工厂模式 用来生产不同产品族的全部产品，一个工厂可以生产跟该产品相关的一系列产品
 * 
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		IphoneXFactory iphoneXFactory = new IphoneXFactory();
		Telephone iphoneX = iphoneXFactory.producePhone();
		Charger iphoneXCharger = iphoneXFactory.produceCharger();
		iphoneXCharger.charger();
		iphoneX.play();
	}

}
