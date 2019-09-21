package com.cognizant.sharingeconomy.dao;

import com.cognizant.sharingeconomy.model.Vendor;

public interface VendorDao {
	
	public void addVendor(Vendor vendor) throws Exception;
	public int  vendorLoginDetails(Vendor vendor) throws Exception;
	

}
