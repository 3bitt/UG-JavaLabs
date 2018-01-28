package interfejs;

import java.util.List;

import model.Company;

public interface CompDAOInterf {
	    
	    public void createCompany(Company company);
	    
	    public void createTableCompany();
	 
	    public List<Company> getAllCompanies();
	 
	    public int updateCompany(Company company);
	 
	    public void deleteCompany(int id);
	}

