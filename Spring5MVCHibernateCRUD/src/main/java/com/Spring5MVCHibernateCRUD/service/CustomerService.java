package com.Spring5MVCHibernateCRUD.service;

import java.util.List;

import com.Spring5MVCHibernateCRUD.entity.Customer;

public interface CustomerService 
{
	 public List < Customer > getCustomers();
     public void saveCustomer(Customer theCustomer);
     public Customer getCustomer(int theId);
     public void deleteCustomer(int theId);
}
