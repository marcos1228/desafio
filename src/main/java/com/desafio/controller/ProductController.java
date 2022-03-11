package com.desafio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.domain.model.Product;
import com.desafio.domain.model.dto.request.ProductDtoRequest;
import com.desafio.domain.model.dto.response.ProductDtoRespoonse;
import com.desafio.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	@PostMapping()
	public ResponseEntity<ArrayList<ProductDtoRespoonse>> save(@RequestBody List<ProductDtoRequest> product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
	}
}
