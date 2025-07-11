package com.apphoteleira.model;

public class Funcionario extends Pessoa {
	
	protected String funcao;
	
	
	// METODO CONSTRUTOR
	public Funcionario(String nome, String documento, String funcao) {
		
		super(nome, documento);
		this.funcao = funcao;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Função: "+ funcao);
	}

}
