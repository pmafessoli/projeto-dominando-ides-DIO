package com.dio;

import com.dio.model.Gato;

/**
 * 
 * @author Pablo Mafessoli
 *
 */

public class PrimieiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();

		System.out.println(gato);
		System.out.println(livros);

		int a = 2;
		int b = 3;
		System.out.println("Hello Word! " + (a + b));

	}
}

class Livros {
	private String nome;
	private String nPag;
}