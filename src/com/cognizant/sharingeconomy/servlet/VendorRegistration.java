package com.cognizant.sharingeconomy.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.sharingeconomy.dao.ConnectionHandler;
import com.cognizant.sharingeconomy.dao.VendorDao;
import com.cognizant.sharingeconomy.dao.VendorDaoSqlImpl;
import com.cognizant.sharingeconomy.model.Vendor;


@WebServlet("/VendorRegistration")
public class VendorRegistration extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		Vendor vendor=new Vendor(request.getParameter("fname"),request.getParameter("lname"),Integer.parseInt(request.getParameter("age")),request.getParameter("gender"),Long.parseLong(request.getParameter("cno")),request.getParameter("eid"),request.getParameter("vid"),request.getParameter("pass"));
		VendorDao vdsi=new VendorDaoSqlImpl();
		
		try {
			vdsi.addVendor(vendor);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
	
	}
	
}
