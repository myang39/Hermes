package onlineShop.dao;

import onlineShop.model.Customer;

public interface CustomerDao {
	// data access object
	
	void addCustomer(Customer customer);
	
	Customer getCustomerByUsername(String userName);
	
}
