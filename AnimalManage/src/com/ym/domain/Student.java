/*
* Student.java
* Version 1.0.0
* Created on 2019年3月6日
* Copyright QuickCodes.net
*
*/
package com.ym.domain;

/**
 * @author Ben
 * @version 1.0.0
 * @since 
 * 创建时间：2019年3月6日
 * 功能描述：
 */
public class Student {

	int id;
	String name;
	int age;
	String address;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}
