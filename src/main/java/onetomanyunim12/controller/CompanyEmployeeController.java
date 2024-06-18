package onetomanyunim12.controller;

import onetomanyunim12.dao.CompanyDao;
import onetomanyunim12.dto.Company;

public class CompanyEmployeeController {
public static void main(String[] args) {
	Company company=new Company();
	company.setId(101);
	company.setName("poojithapvt limited");
	company.setGst("pooji@123");
	
CompanyDao companyDao=new CompanyDao();
companyDao.saveCompany(company);
}
}
