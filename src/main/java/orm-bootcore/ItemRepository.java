package com.example.bootcore;

import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
	
	// Find items by their ID
    Item findById(long id);
 
    // Find items by their name
    List<Item> findByItemName(String itemName);
 
    // Find items by their price
    List<Item> findByPrice(BigDecimal price);
 
    // Find items by their quantity
    List<Item> findByQuantity(int quantity);
 
    // Find items by their order's status
    List<Item> findByOrder_OrderStatus(OrderStatus orderStatus);

}
