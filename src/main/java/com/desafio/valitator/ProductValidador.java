package com.desafio.valitator;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio.domain.model.dto.request.ProductDtoRequest;

@Service
public class ProductValidador {
	
	private static final int CONST = 100;

	public void validarTamanho(List<ProductDtoRequest> products) {
		if (products.size() > CONST) {
			throw new RuntimeException("NO MAXIMO 100");
		}

	}

}
