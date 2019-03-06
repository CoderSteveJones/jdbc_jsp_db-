/*
* UserDaoImp.java
* Version 1.0.0
* Created on 2019年3月6日
* Copyright QuickCodes.net
*
*/
package com.ym.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ym.dao.UserDao;
import com.ym.util.JDBCUtil;

/**
 * @author Ben
 * @version 1.0.0
 * @since 
 * 创建时间：2019年3月6日
 * 功能描述：
 */
public class UserDaoImp implements UserDao {

	/* (non-Javadoc)
	 * @see com.ym.dao.UserDao#login(java.lang.String, java.lang.String)
	 */
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from t_user where username=? and password=?;";
		try {
			con = JDBCUtil.getConn();
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
