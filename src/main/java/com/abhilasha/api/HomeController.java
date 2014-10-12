package com.abhilasha.api;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.abhilasha.bo.ChildBO;
import com.abhilasha.jdbc.dao.ChildDAO;
import com.abhilasha.jdbc.dao.ChildNeedDAO;
import com.abhilasha.jdbc.dao.DonationDAO;
import com.abhilasha.jdbc.dao.DonorDAO;
import com.abhilasha.jdbc.dao.WishDAO;
import com.abhilasha.jdbc.dao.impl.ChildDAOImpl;
import com.abhilasha.jdbc.dao.impl.DonationDAOImpl;
import com.abhilasha.jdbc.model.Child;
import com.abhilasha.jdbc.model.ChildNeed;
import com.abhilasha.jdbc.model.Donation;
import com.abhilasha.jdbc.model.Donor;
import com.abhilasha.jdbc.model.Wish;
import com.abhilasha.pojo.ChildNeedPojo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	ServletContext servletContext;

	@Autowired
	DonorDAO donorDAO;

	@Autowired
	ChildDAO childDAO;

	@Autowired
	ChildNeedDAO childNeedDAO;
	
	@Autowired
	ChildBO childBO;

	@Autowired
	DonationDAO donationDAO;
	
	@Autowired
	WishDAO wishDAO;

	private String imageDir = "C:\\Users\\vijmkumar\\abhilasha\\abhilasha\\src\\main\\webapp\\resources\\dp\\";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "index";
	}

	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String authorize(@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "pwd", required = true) String pwd) {
		return null;
	}
	
	@RequestMapping(value = "/makeDonation", method = RequestMethod.POST)
	public String makeDonation(HttpServletRequest request, Model model) {
		Enumeration<String> names = request.getParameterNames();
		int donorId = Integer.parseInt(request.getParameter("donorid"));
		int childId = Integer.parseInt(request.getParameter("childid"));
		int amount = 0;
		Date date = new Date();
		ArrayList<Donation> needs = new ArrayList<Donation>();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name.equals("donorid")) {
				// do nothing
			} else if (name.equals("childid")) {
				// do nothing
			} else if (name.equals("food")) {
				if (request.getParameter("food") != "") {
					amount = Integer.parseInt(request.getParameter("food"));
				} else {
					amount = 0;
				}
				needs.add(new Donation(donorId, childId, 1, date.toString(),
						amount));
			} else if (name.equals("clothing")) {
				if (request.getParameter("clothing") != "") {
					amount = Integer.parseInt(request.getParameter("clothing"));
				} else {
					amount = 0;
				}
				needs.add(new Donation(donorId, childId, 4, date.toString(),
						amount));
			} else if (name.equals("medical")) {
				if (request.getParameter("medical") != "") {
					amount = Integer.parseInt(request.getParameter("medical"));
				} else {
					amount = 0;
				}
				needs.add(new Donation(donorId, childId, 3, date.toString(),
						amount));
			} else if (name.equals("education")) {
				if (request.getParameter("education") != "") {
					amount = Integer
							.parseInt(request.getParameter("education"));
				} else {
					amount = 0;
				}
				needs.add(new Donation(donorId, childId, 2, date.toString(),
						amount));
			} else {
				// add to wish table
			}
		}
		for (int i = 0; i < needs.size(); i++) {
			if (needs.get(i).getAmountdonated() > 0) {
				Donation donation = donationDAO.save(needs.get(i));
				System.out.println(donation.getId());
			}
		}
		return "donationSuccess";
	}

	@RequestMapping(value = "/registerDonorAction", method = RequestMethod.POST)
	public String createDonor(
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "dob", required = true) String dob,
			@RequestParam(value = "address", required = true) String address,
			@RequestParam(value = "phNoRes", required = true) String phNoRes,
			@RequestParam(value = "phNoOfc", required = true) String phNoOfc,
			@RequestParam(value = "mobile", required = true) String mobile,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "photo", required = false) MultipartFile file,
			Model model) {
		Donor donor = new Donor(name, dob, address, phNoRes, phNoOfc, mobile,
				email);
		donor = donorDAO.save(donor);
		if (donor != null && donor.getId() > 0) {
			if (!file.isEmpty()) {
				saveImage(
						"donor_" + donor.getId() + "."
								+ getFileExt(file.getOriginalFilename()), file);
			}
			model.addAttribute(donor);
			return "donorCreatedSuccess";
		} else {
			return "donorCreatedFail";
		}
	}

	@RequestMapping(value = "/registerChildAction", method = RequestMethod.POST)
	public String registerChild(
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "admissionNumber", required = true) String admissionNumber,
			@RequestParam(value = "dob", required = true) String dob,
			@RequestParam(value = "age", required = true) int age,
			@RequestParam(value = "sex", required = true) int sex,
			@RequestParam(value = "std", required = true) String std,
			@RequestParam(value = "fatherName", required = true) String fatherName,
			@RequestParam(value = "fatherEducation", required = true) String fatherEducation,
			@RequestParam(value = "fatherEmployment", required = true) String fatherEmployment,
			@RequestParam(value = "motherName", required = true) String motherName,
			@RequestParam(value = "motherEducation", required = true) String motherEducation,
			@RequestParam(value = "motherEmployment", required = true) String motherEmployment,
			@RequestParam(value = "familyHistory", required = true) String familyHistroy,
			@RequestParam(value = "address", required = true) String addess,
			@RequestParam(value = "familyIncome", required = true) int familyIncome,
			@RequestParam(value = "category", required = true) String category,
			@RequestParam(value = "hivInfection", required = true) int hivInfection,
			@RequestParam(value = "parentsHadhiv", required = true) int parentsHadhiv,
			@RequestParam(value = "conduct", required = true) String conduct,
			@RequestParam(value = "academicPerformance", required = true) String academicPerformance,
			@RequestParam(value = "dream", required = true) String dream,
			@RequestParam(value = "schoolImpact", required = true) String schoolImpact,
			@RequestParam(value = "food", required = false) Integer food,
			@RequestParam(value = "education", required = false) Integer education,
			@RequestParam(value = "medical", required = false) Integer medical,
			@RequestParam(value = "clothing", required = false) Integer clothing,
			@RequestParam(value = "wish", required = false) String wish, 
			@RequestParam(value = "photo", required = false) MultipartFile file,
			Model model) {
		ArrayList<Integer> needs = new ArrayList<Integer>();
		if (food != null) {
			needs.add(food);
		}
		if (education != null) {
			needs.add(education);
		}
		if (medical != null) {
			needs.add(medical);
		}
		if (clothing != null) {
			needs.add(clothing);
		}
		System.out.println(wish);
		Child child = new Child(name, admissionNumber, dob, age, sex, std,
				fatherName, fatherEducation, fatherEmployment, motherName,
				motherEducation, motherEmployment, familyHistroy, addess,
				familyIncome, category, hivInfection, parentsHadhiv, conduct,
				academicPerformance, dream, schoolImpact);
		child = childDAO.save(child);
		if (child != null && child.getId() > 0) {
			if (!file.isEmpty()) {
				saveImage(
						"child_" + child.getId() + "."
								+ getFileExt(file.getOriginalFilename()), file);
			}
			ChildNeed childNeed = new ChildNeed(child.getId(), needs);
			childNeedDAO.save(childNeed);
			Wish wish1 = new Wish();
			wish1.setChildId(child.getId());
			wish1.setDonatedAmount(0);
			wish1.setWish(wish);
			wishDAO.save(wish1);
			return "childCreatedSuccess";
		} else {
			return "childCreatedFail";
		}
	}

	@RequestMapping(value = "/getAllChildren", method = RequestMethod.GET)
	public String getAllChildren(Model model) {
		ArrayList<Child> children = childDAO.getAllChildren();
		ArrayList<String> wishes = new ArrayList<String>();
		for (Child child : children) {
			Wish w = wishDAO.findWishByChildId(child.getId());
			if (w != null) {
				wishes.add(w.getWish());
				System.out.println(child.getName() + "\t" + wishDAO.findWishByChildId(child.getId()).getWish());
			} else {
				wishes.add(null);
			}
		}
		model.addAttribute("children", children);
		model.addAttribute("wishes", wishes);
		return "displayChildren";
	}
	
	@RequestMapping(value = "/getAllDonors", method = RequestMethod.GET)
	public String getAllDonors(Model model) {
		ArrayList<Donor> donors = donorDAO.getAllDonors();
		for (Donor donor : donors) {
			System.out.println(donor.getName());
		}
		model.addAttribute("donors", donors);
		return "displayAllDonorsTabular";
	}

	@RequestMapping(value = "/registerDonor", method = RequestMethod.GET)
	public String donorRegister() {
		return "donorRegistration";
	}
	
	

	@RequestMapping(value = "/childProfile/{childId}", method = RequestMethod.GET)
	public String childProfile(@PathVariable("childId")int childId, Model model) {
		Child child = childDAO.findById(childId);
		model.addAttribute("child", child);
		ChildNeed childNeed = childNeedDAO.findNeedByChildId(childId);
		ArrayList<ChildNeedPojo> needPojoList = new ArrayList<ChildNeedPojo>();
		if (childNeed != null) {
			for (int needId : childNeed.getNeedid()) {
				//System.out.println(needId);
				int total = childBO.getTotalAmount(childId, needId);
				int donated = childBO.getAmountDonatedTillNow(childId, needId);
				int required = childBO.getRequiredAmount(childId, needId);
				needPojoList.add(new ChildNeedPojo(childId, needId, total, donated, required));
			}
		}
		model.addAttribute("needPojoList", needPojoList);
		return "childProfile";
	}
	
	@RequestMapping(value = "/donorProfile", method = RequestMethod.GET)
	public String donorProfile(Model model) {
		int donorId = 1;
		Donor donor = donorDAO.findDonarById(donorId);
		model.addAttribute("donor", donor);
		return "donorProfile";
	}

	@RequestMapping(value = "/registerChild", method = RequestMethod.GET)
	public String childRegister() {
		return "childRegistration";
	}

	private String getFileExt(String fileName) {
		int i = fileName.lastIndexOf('.');
		if (i > 0) {
			return fileName.substring(i + 1);
		}
		return "";
	}

	private boolean saveImage(String name, MultipartFile file) {
		try {
			byte[] bytes = file.getBytes();
			// Create the file on server
			File serverFile = new File(imageDir + name);
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(serverFile));
			stream.write(bytes);
			stream.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
