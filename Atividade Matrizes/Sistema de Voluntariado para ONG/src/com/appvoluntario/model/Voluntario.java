package com.appvoluntario.model;

public class Voluntario extends Pessoa {
	
	protected String areaAtuacao;
	
	
	
	// METODO CONSTRUTOR
	public Voluntario(String nome, String cidade, String areaAtuacao) {
		
		super(nome,cidade);
		this.areaAtuacao = areaAtuacao;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Area de atuação: "+ areaAtuacao);
	}

}
