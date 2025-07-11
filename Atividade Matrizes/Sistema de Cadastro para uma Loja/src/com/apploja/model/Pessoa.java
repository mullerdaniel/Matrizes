package com.apploja.model;

public class Pessoa {
	
	protected String nome;
	protected int telefone;
	
	
	// METODO CONSTRUTOR
	public Pessoa(String nome, int telefone) {
		
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		System.out.println ("Nome: "+ nome);
		System.out.println ("Telefone: "+ telefone);
	}

}
