package com.nguyenanhtu.customer.dao;

import com.nguyenanhtu.customer.model.Customer;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
