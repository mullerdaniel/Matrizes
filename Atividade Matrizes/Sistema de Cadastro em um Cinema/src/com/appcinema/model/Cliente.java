package com.appcinema.model;

public class Cliente extends Pessoa {
	
	protected String tipoIngresso;
	
	
	// METODO CONSTRUTOR
	public Cliente(String nome, String email, String tipoIngresso) {
		
		super(nome,email);
		this.tipoIngresso = tipoIngresso;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Tipo do ingresso: "+ tipoIngresso);
	}

}
