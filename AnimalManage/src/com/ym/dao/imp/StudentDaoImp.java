/*
* StudentDaoImp.java
* Version 1.0.0
* Created on 2019年3月6日
* Copyright QuickCodes.net
*
*/
package com.ym.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.ym.dao.StudentDao;
import com.ym.domain.Student;
import com.ym.util.JDBCUtil;

/**
 * @author Ben
 * @version 1.0.0
 * @since 
 * 创建时间：2019年3月6日
 * 功能描述：
 */
public class StudentDaoImp implements StudentDao {

	/* (non-Javadoc)
	 * @see com.ym.dao.StudentDao#findAll()
	 */
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		Connection con = null;
		java.sql.PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from t_stu;";
		List<Student> list = null;
		try {
			con = JDBCUtil.getConn();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			list = new ArrayList<Student>();
			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setAddress(rs.getString("address"));
				list.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return list;
	}

	
}
