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

import com.abhilasha.jdbc.dao.ChildDAO;
import com.abhilasha.jdbc.dao.DonorDAO;
import com.abhilasha.jdbc.model.Child;
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

	@Autowired
	ChildDAO childDAO;

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
		Donor donor = new Donor(name, dob, address, phNoRes, phNoOfc, mobile,
				email);
		donor = donorDAO.save(donor);
		if (donor != null && donor.getId() > 0) {
			model.addAttribute(donor);
			return "donorCreatedSuccess";
		} else {
			return "donorCreatedFail";
		}
	}

	@RequestMapping(value = "/registerChild", method = RequestMethod.POST)
	public String registerChild(
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "admissionNumber", required = true) String admissionNumber,
			@RequestParam(value = "dob", required = true) String dob,
			@RequestParam(value = "age", required = true) int age,
			@RequestParam(value = "sex ", required = true) int sex,
			@RequestParam(value = "std", required = true) String std,
			@RequestParam(value = "fatherName", required = true) String fatherName,
			@RequestParam(value = "fatherEducation", required = true) String fatherEducation,
			@RequestParam(value = "fatherEmployment", required = true) String fatherEmployment,
			@RequestParam(value = "motherName", required = true) String motherName,
			@RequestParam(value = "motherEducation", required = true) String motherEducation,
			@RequestParam(value = "motherEmployment", required = true) String motherEmployment,
			@RequestParam(value = "familyHistroy", required = true) String familyHistroy,
			@RequestParam(value = "addess", required = true) String addess,
			@RequestParam(value = "familyIncome", required = true) int familyIncome,
			@RequestParam(value = "category", required = true) String category,
			@RequestParam(value = "hivInfection", required = true) int hivInfection,
			@RequestParam(value = "parentsHadhiv", required = true) int parentsHadhiv,
			@RequestParam(value = "conduct", required = true) String conduct,
			@RequestParam(value = "academicPerformance", required = true) String academicPerformance,
			@RequestParam(value = "dream", required = true) String dream,
			@RequestParam(value = "schoolImpact", required = true) String schoolImpact,
			Model model) {
		Child child = new Child(name, admissionNumber, dob, age, sex, std,
				fatherName, fatherEducation, fatherEmployment, motherName,
				motherEducation, motherEmployment, familyHistroy, addess,
				familyIncome, category, hivInfection, parentsHadhiv, conduct,
				academicPerformance, dream, schoolImpact);
		childDAO.save(child);
		if (child != null && child.getId() > 0) {
			return "childCreatedSuccess";
		} else {
			return "childCreatedFail";
		}
	}
}
