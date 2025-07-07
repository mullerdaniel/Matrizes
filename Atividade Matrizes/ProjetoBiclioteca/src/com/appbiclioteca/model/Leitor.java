package com.appbiclioteca.model;

public class Leitor extends Pessoa{
	
	protected int matricula;
	
	
	// METODO CONSTRUTOR
	public Leitor(String nome, String cpf, int matricula) {
		
		super(nome, cpf);
		this.matricula = matricula;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Matricula: "+ matricula);
	}

}
