package com.example.bootcore;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class OrderService {

	// Implement business logic using repositories
	private final OrderRepository orderRepository;
	 
    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public void printReportForOrderId(Long orderId) {
        // Call the custom query method to retrieve the order
        Order order = orderRepository.findOrderById(orderId);
 
        // Implement your logic to print the report based on the order details
        if (order != null) {
            System.out.println("Report for Order ID " + orderId);
            System.out.println("Order Date: " + order.getOrderDate());
            // Print other order details as needed
        } else {
            System.out.println("Order with ID " + orderId + " not found.");
        }
    }
 
    // Business logic to retrieve order details by order ID
    public Order getOrderDetails(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }
 
    // Business logic to retrieve all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
 
    // Business logic to retrieve orders by customer ID
    public List<Order> getOrdersByCustomer(Long customerId) {
        // Implement logic to retrieve orders by customer ID using the repository
        return (orderRepository).findByCustomer_Id(customerId);
    }
 
    // Business logic to create a new order
    public Order createOrder(Order newOrder) {
        // Implement logic to create a new order using the repository
        return orderRepository.save(newOrder);
    }
 
    // Business logic to update an existing order
    public Order updateOrder(Long orderId, Order updatedOrder) {
        // Implement logic to update an existing order using the repository
        Order existingOrder = orderRepository.findById(orderId).orElse(null);
        if (existingOrder != null) {
            // Update relevant fields
            existingOrder.setOrderStatus(updatedOrder.getOrderStatus());
            // Update other fields as needed
 
            // Save the updated order
            return orderRepository.save(existingOrder);
        }
        return null; // Handle case where the order is not found
    }
 
    // Business logic to delete an order
    public void deleteOrder(Long orderId) {
        // Implement logic to delete an order using the repository
        orderRepository.deleteById(orderId);
    }
}