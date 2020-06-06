package com.factory.abstrsctfantory;

/**
 * 手机大工厂 要生产手机和相应的充电器
 * 
 * @author Administrator
 *
 */
public interface PhoneFactory {
	Telephone producePhone();

	Charger produceCharger();
}
