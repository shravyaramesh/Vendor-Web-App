package com.shravya.vendor.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shravya.vendor.entities.Vendor;
import com.shravya.vendor.services.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	private VendorService service;
	
	@RequestMapping("/showCreate")
	public String createVendor() {
		return "createVendor";
	}
	
	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor createdVendor = service.createVendor(vendor);
		String msg = "Vendor with ID: "+createdVendor.getId()+" saved!";
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}
	
	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap) {
		List<Vendor> vendors = new ArrayList<>();
		Iterable<Vendor> iterableVendors = service.getAllVendors();
		Iterator<Vendor> it = iterableVendors.iterator();
		while(it.hasNext()) {
			Vendor vendor = it.next();
			vendors.add(vendor);
		}
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/editVendor")
	public String editVendor(@ModelAttribute("id") int id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "updateVendor";
	}
	
	
	
	@RequestMapping("/deleteVendor")
	public String deleteVenor(int id, ModelMap modelMap) {
		List<Vendor> vendors = new ArrayList<>();
		Vendor vendor = service.getVendorById(id);
		service.deleteVendor(vendor);
		
		Iterable<Vendor> iterable = service.getAllVendors();
		Iterator<Vendor> it = iterable.iterator();
		while(it.hasNext()) {
			vendor = it.next();
			vendors.add(vendor);
		}
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
}
