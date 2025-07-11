package com.appacademia.model;

public class Instrutor extends Pessoa {
	
	protected String especialidade;
	
	
	
	// METODO CONSTRUTOR
	public Instrutor(String nome, int idade, String especialidade) {
		
		super(nome,idade);
		this.especialidade = especialidade;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Especialidade: "+ especialidade);
	}
}
