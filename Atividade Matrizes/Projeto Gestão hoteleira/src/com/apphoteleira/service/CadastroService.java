package com.apphoteleira.service;

import java.util.Scanner;
import com.apphoteleira.model.Pessoa;
import com.apphoteleira.model.Hospede;
import com.apphoteleira.model.Funcionario;

public class CadastroService {
	Scanner input = new Scanner (System.in);
	
	
	
	// METODO PARA CADASTRAR PACIENTE
	public Hospede cadastrarHospede() {
		
		System.out.println ("Digite o nome do hospede: ");
		String nome = input.nextLine();
		System.out.println ("Digite o documento do hospede: ");
		String documento = input.nextLine();
		System.out.println ("Digite o numero do quarto do hospede: ");
		String numeroQuarto = input.nextLine();
		return new Hospede(nome, documento, numeroQuarto);
	}
	
	
	// METODO PARA CADASTRAR MEDICO
	public Funcionario cadastrarFuncionario() {
		
		System.out.println ("Digite o nome do funcionario: ");
		String nome = input.nextLine();
		System.out.println ("Digite o documento do funcionario: ");
		String documento = input.nextLine();
		System.out.println ("Digite a função do funcionario: ");
		String funcao = input.nextLine();
		return new Funcionario(nome, documento, funcao);
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados(Pessoa pessoa) {
		pessoa.mostrarDados();
		
	}

}
