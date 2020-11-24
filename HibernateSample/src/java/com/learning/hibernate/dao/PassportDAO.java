
package com.learning.hibernate.dao;

import java.util.List;
import com.learning.hibernate.model.Passport;

public interface PassportDAO
{	
	public boolean savePassport(Passport passport);	
	public boolean deletePassport(Passport passport);
	public Passport getPassportbyId(int id);
	public boolean updatePassport(Passport passport);
	public List<Passport> getAllPassports();
}
