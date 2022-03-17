package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.VendorDao;
import com.ecommerce.entity.Vendor;
@Service
public class VendorServiceImpl implements VendorService{

	@Autowired
	private VendorDao vendorDao;
	
	@Override
	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorDao.save(vendor);
		return null;
	}

}