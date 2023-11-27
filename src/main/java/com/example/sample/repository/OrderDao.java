package com.example.sample.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.sample.model.Order;

@Repository
public class OrderDao {

	public List<Order> buildOrder() {
		return Stream.of(
				new Order(101, "Mobile", 20000.0, 1),
				new Order(102, "Book", 999.0, 2),
				new Order(103, "Book2", 1466.0, 3),
				new Order(953, "Pant", 4499.0, 1)
				).collect(Collectors.toList());
	}
}
