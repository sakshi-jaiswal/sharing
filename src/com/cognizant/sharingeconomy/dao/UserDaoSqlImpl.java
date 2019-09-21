package com.cognizant.sharingeconomy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cognizant.sharingeconomy.model.User;

public class UserDaoSqlImpl implements UserDao{

	@Override
	public void addUser(User user) throws Exception {
		
		Connection con=ConnectionHandler.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into share_economy_user_details(us_first_name,us_last_name,us_age,us_gender,us_contact_number,us_email,us_user_id,us_password) values (?,?,?,?,?,?,?,?)");
		
		ps.setString(1,user.getFirstName());
		ps.setString(2,user.getLastName());
		ps.setInt(3,user.getAge());
		ps.setString(4,user.getGender());
		ps.setLong(5,user.getContactNumber());
		ps.setString(6,user.getEmail());
		ps.setString(7,user.getUserId());
		ps.setString(8,user.getPassword());
		
		ps.executeUpdate();
		System.out.println( "In addUser");
		con.close();
	}

}
