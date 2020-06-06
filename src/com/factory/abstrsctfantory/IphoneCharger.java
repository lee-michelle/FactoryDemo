package com.factory.abstrsctfantory;

/**
 * 苹果手机充电器实现
 * 
 * @author Administrator
 *
 */
public class IphoneCharger implements Charger {

	@Override
	public void charger() {
		System.out.println("苹果手机充电器生产");
	}

}
