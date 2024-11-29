package com.orderEntity;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	 @Cacheable(value = "orders", key = "#id")
	    public Order getOrderByIdOrder(Long id) {
	        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));}
	
    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        order.setOrderDate(LocalDateTime.now());
        order.setStatus("PLACED");
        return orderRepository.save(order);
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public void cancelOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

