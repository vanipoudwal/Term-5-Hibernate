
package com.learning.hibernate.driver;

import java.util.List;
import com.learning.hibernate.dao.PassportDAO;
import com.learning.hibernate.dao.impl.PassportDAOImpl;
import com.learning.hibernate.model.Passport;

public class PassportDriver
{
	public static void main(String[] args)
	{	
		PassportDAO passportDAO = new PassportDAOImpl();
		
		int Choice = 2;
		switch(Choice)
		{
			case 1: 
				Passport pt1 = new Passport("ABCD0001", "New Delhi");
				passportDAO.savePassport(pt1);
				break;
			
			case 2: 
				Passport pt2 = passportDAO.getPassportbyId(1);
				pt2.setAuthority("Bangalore");
				passportDAO.updatePassport(pt2);
				break;
			
			case 3: 
				Passport pt3 = passportDAO.getPassportbyId(3);
				passportDAO.deletePassport(pt3);
				break;
		
			case 4: 
				Passport pt4 = passportDAO.getPassportbyId(3);
				System.out.println(pt4);
				break;
		
			case 5: 
				List<Passport> pt5 = passportDAO.getAllPassports();
				System.out.println(pt5);
			
			case 6:
				System.exit(0);

			default:
				System.out.println("Please Enter A Valid Choice");
		}
	}
}
