package com.factory.abstrsctfantory;

/**
 * 生产苹果手机的车间
 * 
 * @author Administrator
 *
 */
public class IphoneXFactory implements PhoneFactory {

	@Override
	public Telephone producePhone() {
		return new IphoneX();
	}

	@Override
	public Charger produceCharger() {
		return new IphoneCharger();
	}

}
