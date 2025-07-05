package com.appclinica.model;

public class Pessoa {
	
	protected String nome;
	protected int telefone;
	
	
	// METODO CONSTRUTOR
	public Pessoa(String nome, int telefone) {
		
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	public void mostrarDados() {
		
		System.out.println ("\nNome: "+ nome);
		System.out.println ("Telefone: "+ telefone);
	}

}
