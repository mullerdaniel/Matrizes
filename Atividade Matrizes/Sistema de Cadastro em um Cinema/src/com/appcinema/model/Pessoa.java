package com.appcinema.model;

public class Pessoa {
	
	protected String nome;
	protected String email;
	
	
	// METODO CONSTRUTOR
	public Pessoa(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		System.out.println ("Nome: "+ nome);
		System.out.println ("Email: "+ email);
	}

}
