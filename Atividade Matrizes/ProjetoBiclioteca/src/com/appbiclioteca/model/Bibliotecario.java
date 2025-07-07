package com.appbiclioteca.model;

public class Bibliotecario extends Pessoa{
	
	
	protected String turno;
	
	
	// METODO CONSTRUTOR
	public Bibliotecario(String nome, String cpf, String turno) {
		
		super(nome, cpf);
		this.turno = turno;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Turno: "+ turno);
	}

}
