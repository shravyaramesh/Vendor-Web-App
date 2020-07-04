package com.shravya.vendor.services;

import java.util.List;

import com.shravya.vendor.entities.Vendor;

public interface VendorService {
	
	Vendor createVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	Vendor getVendorById(int id);
	List<Vendor> getAllVendors();
	void deleteVendor(Vendor vendor);

}
