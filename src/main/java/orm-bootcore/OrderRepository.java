package com.example.bootcore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	// Find an order by its ID
    Order findById(long id);
 
    // Find orders by the order date
    List<Order> findByOrderDate(Date orderDate);
 
    // Find orders by their status
    List<Order> findByOrderStatus(OrderStatus orderStatus);
 
    // Find orders by the total amount
    List<Order> findByTotalAmountGreaterThan(BigDecimal totalAmount);
 
    // Find orders by the associated customer
    List<Order> findByCustomer(Customer customer);

    List<Order> findByCustomer_Id(Long customerId);
    
    Order findOrderById(Long orderId);
    
    @Query("SELECT o FROM Order o WHERE O.customer.id = :customerId")
    List<Order> findOrdersByCustomerId(@Param("customerId") Long customerId);


}
