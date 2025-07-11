package com.apploja.model;

public class Vendedor extends Pessoa {
	
protected double metaMensal;

	
	
	// METODO CONSTRUTOR
	public Vendedor(String nome, int telefone, double metaMensal) {
		
		super(nome,telefone);
		this.metaMensal = metaMensal;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Meta Mensal de: "+ metaMensal);
	}
}

