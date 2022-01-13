package com.example.pizzasimple.pizza.service;

import com.example.pizzasimple.pizza.model.Dish;
import com.example.pizzasimple.pizza.model.Order;
import com.example.pizzasimple.pizza.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Iterable<Order> findAllOrders() { return orderRepository.findAll(); }

    public void createOrder(ArrayList<Dish> dishes, Float totalCost) {
        orderRepository.save(new Order(null, dishes, totalCost));
    }

    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }
}
