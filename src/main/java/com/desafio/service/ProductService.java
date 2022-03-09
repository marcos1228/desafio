package com.desafio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.domain.model.Product;
import com.desafio.repository.ProductRepository;
import com.desafio.valitator.ProductValidador;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductValidador productValidador;
	
	public ArrayList<Product> save(List<Product> product) {
		ArrayList<Product> list = new ArrayList<Product>();
		productValidador.validarTamanho(product);
		for(Product p: product) {
			list.add(productRepository.save(p));
		}
		
		return list;
	}
}
