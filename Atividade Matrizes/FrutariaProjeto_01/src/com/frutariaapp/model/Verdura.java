package com.frutariaapp.model;

public class Verdura {
	
	private String nome;
	private double preco;
	private int quantidade;
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Verdura() {
		
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
		this.tipo = "";
	}
	
	public Verdura (String nome, double preco, int quantidade, String tipo) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
