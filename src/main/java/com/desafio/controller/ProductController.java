package com.desafio.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.domain.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@PostMapping()
	public ResponseEntity<List<Product>> save(@RequestBody List<Product> product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
}
