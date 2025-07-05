package com.appescola.model;

public class Aluno extends Pessoa {
	
	protected String serie;
	
	
	// CONSTRUTOR
	public Aluno(String nome, String email, String serie) {
		
		super(nome, email);
		this.serie = serie;
	}
	
	
	//METODO PARA MOSTRAR DADOS DO ALUNO
	
	public void mostrarDados() {
		super.mostrarDados(); // ELE CHAMA O METODO DA CLASSE MÃE
		System.out.println ("Serie: "+ serie);
	}

}
