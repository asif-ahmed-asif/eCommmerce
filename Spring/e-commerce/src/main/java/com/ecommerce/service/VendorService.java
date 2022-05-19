package com.ecommerce.service;

import com.ecommerce.entity.Vendor;

public interface VendorService {
	
	public Vendor addVendor(Vendor vendor);
	public Vendor getVendor(int id);
	public int getVendorIdByUserMail(String mail);
}
