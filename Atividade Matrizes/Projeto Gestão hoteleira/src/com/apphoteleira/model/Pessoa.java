package com.apphoteleira.model;

public class Pessoa {
	
	protected String nome;
	protected String documento;
	
	
	// METODO CONSTRUTOR
	public Pessoa(String nome, String documento) {
		
		this.nome = nome;
		this.documento = documento;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		System.out.println ("Nome: "+ nome);
		System.out.println ("Documento: "+ documento);
	}

}
