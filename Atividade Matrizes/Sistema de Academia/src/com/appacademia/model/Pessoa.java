package com.appacademia.model;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	
	
	// METODO CONSTRUTOR
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		System.out.println ("Nome: "+ nome);
		System.out.println ("Idade: "+ idade);
	}

}
