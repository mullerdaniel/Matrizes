package com.appescola.model;

public class Professor extends Pessoa {
	
	protected String disciplina;
	
	
	// CONSTRUTOR
	public Professor(String nome, String email, String disciplina) {
		
		super(nome, email);
		this.disciplina = disciplina;
	}
	
	
	// METODO PARA MOSTRAR OS DADOS DE PROFESSOR
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println ("Disciplina: "+ disciplina);
	}

}
