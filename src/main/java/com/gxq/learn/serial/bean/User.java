package com.gxq.learn.serial.bean;

import java.math.BigDecimal;
import java.util.Date;

public class User {
	private String name;
	private Integer age;
	private BigDecimal money;
	private Long count;
	private Float sum;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Float getSum() {
		return sum;
	}

	public void setSum(Float sum) {
		this.sum = sum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", money=" + money + ", count=" + count + ", sum=" + sum
				+ ", date=" + date + "]";
	}
}
