package com.example.bootcore;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    // Implement methods to handle requests and invoke service method
	
	private final OrderService orderService;
	 
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
 
    // Endpoint to retrieve order details by order ID
    @GetMapping("/{orderId}")
    public Order getOrderDetails(@PathVariable Long orderId) {
        return orderService.getOrderDetails(orderId);
    }
 
    // Endpoint to retrieve all orders
    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
 
    // Endpoint to retrieve orders by customer ID
    @GetMapping("/customer/{customerId}")
    public List<Order> getOrdersByCustomer(@PathVariable Long customerId) {
        return orderService.getOrdersByCustomer(customerId);
    }
 
    // Add more endpoints based on your requirements
 
    // Example of handling a POST request to create a new order
    @PostMapping("/create")
    public Order createOrder(@RequestBody Order newOrder) {
        return orderService.createOrder(newOrder);
    }
 
    // Example of handling a PUT request to update an existing order
    @PutMapping("/update/{orderId}")
    public Order updateOrder(@PathVariable Long orderId, @RequestBody Order updatedOrder) {
        return orderService.updateOrder(orderId, updatedOrder);
    }
 
    // Example of handling a DELETE request to delete an order
    @DeleteMapping("/delete/{orderId}")
    public void deleteOrder(@PathVariable Long orderId) {
        orderService.deleteOrder(orderId);
    }
}