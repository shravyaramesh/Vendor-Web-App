package com.shravya.vendor.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shravya.vendor.entities.Vendor;
import com.shravya.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepository vendorRepo;
	
	@Override
	public Vendor createVendor(Vendor vendor) {
		vendorRepo.save(vendor);
		return vendor;
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		vendorRepo.save(vendor);
		return vendor;
	}

	@Override
	public Vendor getVendorById(int id) {
		Optional<Vendor> optionalVendor = vendorRepo.findById(id);
		Vendor vendor = null;
		if(optionalVendor.isPresent()) {
			vendor = optionalVendor.get();		
		}
		return vendor;
	}

	@Override
	public List<Vendor> getAllVendors() {
		List<Vendor> vendors = new ArrayList();
		Iterable<Vendor> optionalVendors = vendorRepo.findAll();
		Iterator<Vendor> it = optionalVendors.iterator();
		while(it.hasNext()) {
			Vendor vendor = it.next();
			vendors.add(vendor);
			
		}
		return vendors;
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		vendorRepo.delete(vendor);
	}

}
