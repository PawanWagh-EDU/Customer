package com.example.demo.CustomerService;
import com.example.demo.model.Customer;
import java.util.List;

public interface CustomerService {
	
	void add(Customer customer);
	
	List<Customer> display();
	
	Customer delete(Integer id);
	
	void update(Customer customer, Integer id);
	
	Customer search(Integer id);
	
	void addAll(List<Customer>list);
	
	Customer findMob(String mob);
	
	
	
}
