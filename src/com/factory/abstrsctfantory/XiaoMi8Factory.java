package com.factory.abstrsctfantory;

/**
 * 生产小米8手机的车间
 * 
 * @author Administrator
 *
 */
public class XiaoMi8Factory implements PhoneFactory {

	@Override
	public Telephone producePhone() {
		return new XiaoMi8();
	}

	@Override
	public Charger produceCharger() {
		return new XiaoMi8Charger();
	}

}
