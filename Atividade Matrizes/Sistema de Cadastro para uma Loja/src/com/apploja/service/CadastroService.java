package com.apploja.service;

import java.util.Scanner;
import com.apploja.model.Pessoa;
import com.apploja.model.Cliente;
import com.apploja.model.Vendedor;

public class CadastroService {
	Scanner input = new Scanner (System.in);
	
	
	
	// METODO PARA CADASTRAR PACIENTE
	public Cliente cadastrarCliente() {
		
		System.out.println ("Digite o nome do Cliente: ");
		String nome = input.nextLine();
		System.out.println ("Digite o telefone do Cliente: ");
		int telefone = input.nextInt();
		System.out.println ("Digite a preferencia de Pagamento do Cliente: ");
		String preferenciaPagamento = input.nextLine();
		return new Cliente(nome, telefone, preferenciaPagamento);
	}
	
	
	// METODO PARA CADASTRAR MEDICO
	public Vendedor cadastrarVendedor() {
		
		System.out.println ("Digite o nome do Vendedor: ");
		String nome = input.nextLine();
		System.out.println ("Digite o telefone do Vendedor: ");
		int telefone = input.nextInt();
		System.out.println ("Digite a meta Mensal do Vendedor: ");
		Double metaMensal = input.nextDouble();
		return new Vendedor(nome, telefone, metaMensal);
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados(Pessoa pessoa) {
		pessoa.mostrarDados();
		
	}

}
