package com.apppetshop.model;

public class Veterinario extends Pessoa {

protected String registroProfissional;
	
	
	
	// METODO CONSTRUTOR
	public Veterinario(String nome, int telefone, String registroProfissional) {
		
		super(nome,telefone);
		this.registroProfissional = registroProfissional;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Registro Profissional: "+ registroProfissional);
	}

}

