package com.qapitol.day4;

import java.util.LinkedList;
import java.util.List;

public class Manager {

	public static void main(String[] args) {
			
		Employee employee = new Employee();
		Passport passport = new Passport();
		Address addr1 = new Address();
		Address addr2 = new Address();

		List<Address> list = new LinkedList<Address>();
		addr1.setStreetName("dcvmsejfk");
		addr1.setPincode(124235);
		addr1.setAddress("bvsfejf");
		list.add(addr1);
		
		addr2.setStreetName("dcvmsejfk");
		addr2.setPincode(124235);
		addr2.setAddress("bvsfejf");
		list.add(addr2);
		
		
		passport.setpNumber("qwdef213");
		passport.setAddress("BTM");
		
		
		employee.setId(1);
		employee.setName("ABCD");
		employee.setPassport(passport);
		employee.setListOfAddress(list);
		System.out.println(employee.toString());

		
		// ---------------------------------------------------
		
		Employee employee1 = new Employee();
		Passport passport1 = new Passport();
		Address addr3 = new Address();
		List<Address> list1 = new LinkedList<Address>();

		addr3.setStreetName("dcvmsejfk");
		addr3.setPincode(124235);
		addr3.setAddress("bvsfejf");
		list1.add(addr3);
		
		passport1.setpNumber("ffg54y");
		passport1.setAddress("HSR");
		
		
		employee1.setId(1);
		employee1.setName("EFGH");
		employee1.setPassport(passport1);
		employee1.setListOfAddress(list1);
		System.out.println(employee1.toString());

	
	}
}
