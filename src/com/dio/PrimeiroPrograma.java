package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Cleo", "listrada", 14);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}
	
	
}

class Livros {
	private String nome;
	private String npag;
}