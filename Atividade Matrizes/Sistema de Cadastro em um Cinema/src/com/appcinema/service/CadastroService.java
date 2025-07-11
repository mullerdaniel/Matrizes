package com.appcinema.service;

import java.util.Scanner;
import com.appcinema.model.Pessoa;
import com.appcinema.model.Cliente;
import com.appcinema.model.Funcionario;

public class CadastroService {
	Scanner input = new Scanner (System.in);
	
	
	
	// METODO PARA CADASTRAR PACIENTE
	public Cliente cadastrarCliente() {
		
		System.out.println ("Digite o nome do Cliente: ");
		String nome = input.nextLine();
		System.out.println ("Digite o email do Cliente: ");
		String email = input.nextLine();
		System.out.println ("Digite o tipo do ingresso do Cliente: ");
		String tipoIngresso = input.nextLine();
		return new Cliente(nome, email, tipoIngresso);
	}
	
	
	// METODO PARA CADASTRAR MEDICO
	public Funcionario cadastrarFuncionario() {
		
		System.out.println ("Digite o nome do Funcionario: ");
		String nome = input.nextLine();
		System.out.println ("Digite o email do Funcionario: ");
		String email = input.nextLine();
		System.out.println ("Digite a especialidade do Funcionario: ");
		String cargo = input.nextLine();
		return new Funcionario(nome, email, cargo);
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados(Pessoa pessoa) {
		pessoa.mostrarDados();
		
	}

}
