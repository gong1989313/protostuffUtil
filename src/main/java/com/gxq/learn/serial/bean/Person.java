package com.gxq.learn.serial.bean;

import java.math.BigDecimal;

public class Person {
	private BigDecimal money;

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [money=" + money + "]";
	}
}
