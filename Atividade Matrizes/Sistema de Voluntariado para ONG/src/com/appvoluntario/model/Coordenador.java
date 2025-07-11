package com.appvoluntario.model;

public class Coordenador extends Pessoa {
	
	protected String responsabilidade;
	
	
	// METODO CONSTRUTOR
	public Coordenador(String nome, String cidade, String responsabilidade) {
		
		super(nome,cidade);
		this.responsabilidade = responsabilidade;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Responsabilidade: "+ responsabilidade);
	}

}
