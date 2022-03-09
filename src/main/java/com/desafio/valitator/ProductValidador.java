package com.desafio.valitator;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio.domain.model.Product;

@Service
public class ProductValidador {
	private static final int CONST = 3;

	public void validarTamanho(List<Product> products) {
		if (products.size() > CONST) {
			throw new RuntimeException("NO MAXIMO 100");
		}

	}

	public void retornaMedia(List<Product> products) {

	}
}
