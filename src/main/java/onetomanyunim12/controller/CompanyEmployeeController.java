package onetomanyunim12.controller;

import onetomanyunim12.dao.CompanyDao;
import onetomanyunim12.dao.EmployeeDao;
import onetomanyunim12.dto.Company;
import onetomanyunim12.dto.Employee;

public class CompanyEmployeeController {
public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(101);
//	company.setName("poojithapvt limited");
//	company.setGst("pooji@123");
//	
//CompanyDao companyDao=new CompanyDao();
//companyDao.saveCompany(company);


//SAVE EMP
//	Employee employee=new Employee();
//	employee.setId(5);
//	employee.setName("nagendraa");
//	employee.setAddress("MYSURU");
//
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.saveEmployee(101, employee);
//



//UPDATE EMP
//	Employee employee=new Employee();
//	employee.setName("Nagendra");
//	employee.setAddress("Bang");
//
//	EmployeeDao dao=new EmployeeDao();
//	dao.updateEmployee(4, employee);

	Company company=new Company();
//	
//	company.setName("poojithajm pvt limited");
//	company.setGst("pooji@123");
//	CompanyDao companyDao=new  CompanyDao();
//	companyDao.updateCompany(101, company);
	
	
	EmployeeDao employeeDao=new EmployeeDao();
	employeeDao.deleteEmployee(1);
	
	
	
	
	
	
}
}
