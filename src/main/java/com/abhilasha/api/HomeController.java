package com.abhilasha.api;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.abhilasha.jdbc.dao.DonorDAO;
import com.abhilasha.jdbc.model.Donor;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	DonorDAO donorDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}

	@RequestMapping(value = "/registerDonor", method = RequestMethod.POST)
	public String createDonor(
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "dob", required = true) String dob,
			@RequestParam(value = "address", required = true) String address,
			@RequestParam(value = "phNoRes", required = true) String phNoRes,
			@RequestParam(value = "phNoOfc", required = true) String phNoOfc,
			@RequestParam(value = "mobile", required = true) String mobile,
			@RequestParam(value = "email", required = true) String email,

			Model model) {
		Donor donor = new Donor(name, dob, address, phNoRes, phNoOfc, mobile, email);
		donor = donorDAO.save(donor);
		if (donor != null && donor.getId() > 0) {
			model.addAttribute(donor);
			return "donorCreatedSuccess";
		} else {
			return "donorCreatedFail";
		}
	}

	@RequestMapping(value = "/registerChild", method = RequestMethod.GET)
	public String registerChild(Model model) {
		return null;
	}
}
