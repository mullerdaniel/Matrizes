package com.appbiclioteca.model;

public class Pessoa {
	
	protected String nome;
	protected String cpf;
	
	
	// METODO CONSTRUTOR
	public Pessoa(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		System.out.println ("\nNome: "+ nome);
		System.out.println ("CPF: "+ cpf);
	}

}
