package com.cognizant.sharingeconomy.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import com.cognizant.sharingeconomy.model.Vendor;

public class VendorDaoSqlImpl implements VendorDao{
	
	@Override
	public void addVendor(Vendor vendor) throws Exception {
		Connection con=ConnectionHandler.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into share_economy_vendor_details(ve_first_name,ve_last_name,ve_age,ve_gender,ve_contact_number,ve_email,ve_vendor_id,ve_password) values (?,?,?,?,?,?,?,?)");
		ps.setString(1,vendor.getFirstName());
		ps.setString(2,vendor.getLastName());
		ps.setInt(3,vendor.getAge());
		ps.setString(4, vendor.getGender());
		ps.setLong(5,vendor.getContactNumber());
		ps.setString(6,vendor.getEmail());
		ps.setString(7,vendor.getVendorId());
		ps.setString(8,vendor.getPassword());
		int i=ps.executeUpdate();
		System.out.println( "In addVendor");
		con.close();
	}
	public int  vendorLoginDetails(Vendor vendor) throws Exception
	{
		
		Connection con=ConnectionHandler.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from share_economy_vendor_details where ve_vendor_id=? and ve_password=? ");
		ps.setString(1,vendor.getVendorId());
		ps.setString(2,vendor.getPassword());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			return 1;
		}
		return 0;
		
	}

}
