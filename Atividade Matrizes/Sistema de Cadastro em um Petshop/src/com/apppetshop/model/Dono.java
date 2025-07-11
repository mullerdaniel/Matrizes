package com.apppetshop.model;

public class Dono extends Pessoa {
	
	protected String nomePet;
	
	
	
	// METODO CONSTRUTOR
	public Dono(String nome, int telefone, String nomePet) {
		
		super(nome,telefone);
		this.nomePet = nomePet;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Nome do Pet: "+ nomePet);
	}

}
