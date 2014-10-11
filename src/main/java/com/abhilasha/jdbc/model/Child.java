package com.abhilasha.jdbc.model;

public class Child {
	private int id;
	private String name;
	private String admissionNumber;
	private String dob;
	private int age;
	private int sex ;
	private String std;
	private String fatherName;
	private String fatherEducation;
	private String fatherEmployment;
	private String motherName;
	private String motherEducation;
	private String motherEmployment;
	private String familyHistroy;
	private String addess;
	private int familyIncome;
	private String category;//orphan/semi-orphan/poor family
	private int hivInfection;
	private int parentsHadhiv;
	private String conduct;
	private String academicPerformance;
	private String dream;
	private String schoolImpact;
	
	public Child(String name,
			String admissionNumber,
			String dob,
			int age,
			int sex ,
			String std,
			String fatherName,
			String fatherEducation,
			String fatherEmployment,
			String motherName,
			String motherEducation,
			String motherEmployment,
			String familyHistroy,
			String addess,
			int familyIncome,
			String category,
			int hivInfection,
			int parentsHadhiv,
			String conduct,
			String academicPerformance,
			String dream,
			String schoolImpact) {
		this.name = name;
		this.admissionNumber = admissionNumber;
		this.dob = dob;
		this.age = age;
		this.sex = sex ;
		this.std = std;
		this.fatherName = fatherName;
		this.fatherEducation = fatherEducation;
		this.fatherEmployment = fatherEmployment;
		this.motherName = motherName;
		this.motherEducation = motherEducation;
		this.motherEmployment = motherEmployment;
		this.familyHistroy = familyHistroy;
		this.addess = addess;
		this.familyIncome = familyIncome;
		this.category = category;
		this.hivInfection = hivInfection;
		this.parentsHadhiv = parentsHadhiv;
		this.conduct = conduct;
		this.academicPerformance = academicPerformance;
		this.dream = dream;
		this.schoolImpact = schoolImpact;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherEducation() {
		return fatherEducation;
	}
	public void setFatherEducation(String fatherEducation) {
		this.fatherEducation = fatherEducation;
	}
	public String getFatherEmployment() {
		return fatherEmployment;
	}
	public void setFatherEmployment(String fatherEmployment) {
		this.fatherEmployment = fatherEmployment;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMotherEducation() {
		return motherEducation;
	}
	public void setMotherEducation(String motherEducation) {
		this.motherEducation = motherEducation;
	}
	public String getMotherEmployment() {
		return motherEmployment;
	}
	public void setMotherEmployment(String motherEmployment) {
		this.motherEmployment = motherEmployment;
	}
	public String getFamilyHistroy() {
		return familyHistroy;
	}
	public void setFamilyHistroy(String familyHistroy) {
		this.familyHistroy = familyHistroy;
	}
	public String getAddess() {
		return addess;
	}
	public void setAddess(String addess) {
		this.addess = addess;
	}
	public int getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(int familyIncome) {
		this.familyIncome = familyIncome;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getHivInfection() {
		return hivInfection;
	}
	public void setHivInfection(int hivInfection) {
		this.hivInfection = hivInfection;
	}
	public int getParentsHadhiv() {
		return parentsHadhiv;
	}
	public void setParentsHadhiv(int parentsHadhiv) {
		this.parentsHadhiv = parentsHadhiv;
	}
	public String getConduct() {
		return conduct;
	}
	public void setConduct(String conduct) {
		this.conduct = conduct;
	}
	public String getAcademicPerformance() {
		return academicPerformance;
	}
	public void setAcademicPerformance(String academicPerformance) {
		this.academicPerformance = academicPerformance;
	}
	public String getDream() {
		return dream;
	}
	public void setDream(String dream) {
		this.dream = dream;
	}
	public String getSchoolImpact() {
		return schoolImpact;
	}
	public void setSchoolImpact(String schoolImpact) {
		this.schoolImpact = schoolImpact;
	}
}
