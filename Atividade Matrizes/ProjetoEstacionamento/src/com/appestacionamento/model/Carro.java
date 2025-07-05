package com.appestacionamento.model;

public class Carro extends Veiculo {
	
	
	protected int numeroDePortas;
	
	
	//CONSTRUTOR
	public Carro (String placa, String marca, int numeroDePortas) {
		
		super(placa, marca);
		this.numeroDePortas = numeroDePortas;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Numero de portas: "+ numeroDePortas);
	}

}
