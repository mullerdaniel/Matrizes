package com.appcinema.model;

public class Funcionario extends Pessoa {
	
	protected String cargo;
	
	
	
	// METODO PARA MOSTRAR DADOS
	public Funcionario(String nome, String email, String cargo) {
		
		super(nome,email);
		this.cargo = cargo;
	}
	
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Cargo: "+ cargo);
	}

}
