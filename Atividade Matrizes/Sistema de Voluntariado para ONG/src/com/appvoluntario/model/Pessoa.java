package com.appvoluntario.model;

public class Pessoa {
	
	protected String nome;
	protected String cidade;
	
	
	
	// METODO CONSTRUTOR
	public Pessoa(String nome, String cidade) {
		
		this.nome = nome;
		this.cidade = cidade;
	}
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		System.out.println ("Nome: "+ nome);
		System.out.println ("Cidade: "+ cidade);
	}
}
