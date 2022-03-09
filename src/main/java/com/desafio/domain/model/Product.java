package com.desafio.domain.model;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class Product {
	private Long id;
	private String name;
	private BigDecimal price;
}
