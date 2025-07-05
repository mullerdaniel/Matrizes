package com.appestacionamento.model;

public class Veiculo {
	
	protected String placa;
	protected String marca;
	
	
	// CONSTRUTOR
	public Veiculo (String placa, String marca) {
		
		this.placa = placa;
		this.marca = marca;
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados() {
		
		System.out.println ("\nPlaca: "+ placa);
		System.out.println ("Marca: "+ marca);
	}

}
