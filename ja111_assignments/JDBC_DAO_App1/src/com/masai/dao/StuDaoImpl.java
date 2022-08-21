package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.utility.DBUtil;

public class StuDaoImpl implements StudentDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String insertintoStudent(int roll, String name, String address, int marks) {
		String msg="Not inserted..";
		try(Connection conn=DBUtil.provideConn()){
			
			PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);
			
			int x=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

}
