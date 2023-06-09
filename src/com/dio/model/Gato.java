package com.dio.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private int idade;

	public Gato(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getCor() {
		return cor;
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && idade == other.idade && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/*
	 * public Gato(String nome, String cor, int idade) { this.nome = nome; this.cor
	 * = cor; this.idade = idade; }
	 */

}
