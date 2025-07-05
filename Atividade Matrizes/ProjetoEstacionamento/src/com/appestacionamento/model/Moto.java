package com.appestacionamento.model;

public class Moto extends Veiculo {
	
	
	protected int cilindrada;
	
	
	
	// METODO CONSTRUTOR
	public Moto (String placa, String marca, int cilindrada) {
		
		super(placa, marca);
		this.cilindrada = cilindrada;
	}
	
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostraDados() {
		
		super.mostrarDados();
		System.out.println ("Cilindradas: "+ cilindrada +"CC");
	}

}
