package com.appacademia.model;

public class Aluno extends Pessoa {
	
	protected String objetivo;
	
	
	// METODO CONSTRUTOR
	public Aluno(String nome, int idade, String objetivo) {
		
		super(nome,idade);
		this.objetivo = objetivo;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Objetivo: "+ objetivo);
	}


}
