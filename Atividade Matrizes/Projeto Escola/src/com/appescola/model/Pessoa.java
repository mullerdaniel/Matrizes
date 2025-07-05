package com.appescola.model;

public class Pessoa {

	
	protected String nome;
	protected String email;
	
	
	//CONSTRUTOR
	public Pessoa(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
	}
	
	
	//METODO PARA MOSTRAR OS DADOS
	public void mostrarDados() {
		
		System.out.println ("\nNome: "+ nome);
		System.out.println ("Email: "+ email);
	}
}
