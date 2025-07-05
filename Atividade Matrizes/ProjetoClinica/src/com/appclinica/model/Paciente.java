package com.appclinica.model;

public class Paciente extends Pessoa {
	
	protected String planoSaude;
	
	
	// METODO CONSTRUTOR
	public Paciente(String nome, int telefone, String planoSaude) {
		
		super(nome, telefone);
		this.planoSaude = planoSaude;
	}
	
	
	// METODO PARA MOSTRAR DADOS DO PACIENTE
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Plano de Saúde: "+ planoSaude);
	}
	
	

}
