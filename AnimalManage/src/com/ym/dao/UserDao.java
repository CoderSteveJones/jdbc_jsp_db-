/*
* UserDao.java
* Version 1.0.0
* Created on 2019年3月6日
* Copyright QuickCodes.net
*
*/
package com.ym.dao;

/**
 * @author Ben
 * @version 1.0.0
 * @since 
 * 创建时间：2019年3月6日
 * 功能描述：
 */
public interface UserDao {

	boolean login(String username,String password);
}
