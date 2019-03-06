/*
* StudentDao.java
* Version 1.0.0
* Created on 2019年3月6日
* Copyright QuickCodes.net
*
*/
package com.ym.dao;

import java.util.List;

import com.ym.domain.Student;

/**
 * @author Ben
 * @version 1.0.0
 * @since 
 * 创建时间：2019年3月6日
 * 功能描述：
 */
public interface StudentDao {

	List<Student> findAll();
}
