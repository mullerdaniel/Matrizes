package com.apphoteleira.model;

public class Hospede extends Pessoa {
	
	protected String numeroQuarto;
	
	
	// METODO CONSTRUTOR
	public Hospede(String nome, String documento, String numeroQuarto) {
		
		super(nome, documento);
		this.numeroQuarto = numeroQuarto;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Numero do quarto: "+ numeroQuarto);
	}

}
