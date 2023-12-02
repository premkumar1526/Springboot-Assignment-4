package com.example.bootcore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	// Find a customer by their ID
    Customer findById(long id);
 
    // Find customers by their name
    List<Customer> findByName(String name);
 
    // Find customers by their email
    Customer findByEmail(String email);
 
    // Find customers who have placed orders
    List<Customer> findByOrdersIsNotNull();
 
    // Find customers who have not placed any orders
    List<Customer> findByOrdersIsNull();
 
    // Find customers by a specific city
    List<Customer> findByAddressCity(String city);
 
    // Find customers by a specific zip code
    List<Customer> findByAddressZipCode(String zipCode);
 
    // Find customers by a specific order status
    List<Customer> findByOrdersOrderStatus(OrderStatus orderStatus);

}
