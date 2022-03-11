package com.desafio.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.domain.model.Product;
import com.desafio.domain.model.dto.request.ProductDtoRequest;
import com.desafio.domain.model.dto.response.ProductDtoRespoonse;
import com.desafio.utils.ObjectMapperUtils;
import com.desafio.valitator.ProductValidador;

@Service
public class ProductService {
//	@Autowired
//	private ProductRepository productRepository;
	@Autowired
	private ProductValidador productValidador;

	public ArrayList<ProductDtoRespoonse> save(List<ProductDtoRequest> products) {
		List<Product> product = ObjectMapperUtils.mapAll(products, Product.class);
		ArrayList<Product> list = new ArrayList<Product>();
		valorTotal(products);
		productValidador.validarTamanho(products);
		for (Product p : product) {
			list.add(p);
		}
		return (ArrayList<ProductDtoRespoonse>) ObjectMapperUtils.mapAll(list, ProductDtoRespoonse.class);
	}
	
	public BigDecimal valorTotal(List<ProductDtoRequest> products) {
		BigDecimal somar = BigDecimal.valueOf(0);
		for(ProductDtoRequest p: products) {
			somar = somar.add(p.getQuantity());
		}
		return somar;
	}
}
