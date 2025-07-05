package com.appclinica.model;

public class Medico extends Pessoa{
	
	protected String especialidade;
	
	
	// METODO CONSTRUTOR
	public Medico(String nome, int telefone, String especialidade) {
		
		super(nome, telefone);
		this.especialidade = especialidade;
	}
	
	
	// METODO PARA MOSTRAR DADOS DO MEDICO
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Especialidade: "+ especialidade);
	}

}
