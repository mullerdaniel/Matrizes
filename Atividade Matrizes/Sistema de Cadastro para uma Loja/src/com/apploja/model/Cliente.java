package com.apploja.model;

public class Cliente extends Pessoa {
	
	protected String preferenciaPagamento;

	
	
	// METODO CONSTRUTOR
	public Cliente(String nome, int telefone, String preferenciaPagamento) {
		
		super(nome,telefone);
		this.preferenciaPagamento = preferenciaPagamento;
	}
	
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDados() {
		
		super.mostrarDados();
		System.out.println ("Preferencia do Pagamento: "+ preferenciaPagamento);
	}
}
