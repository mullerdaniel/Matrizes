package com.appbiclioteca.service;

import java.util.Scanner;
import com.appbiclioteca.model.Pessoa;
import com.appbiclioteca.model.Leitor;
import com.appbiclioteca.model.Bibliotecario;

public class CadastroService {
	Scanner input = new Scanner(System.in);

	
	
	// METODO PARA CADASTRAR Leitor
	public Leitor cadastrarLeitor() {
		
		System.out.println ("Digite a nome do leitor: ");
		String nome = input.nextLine();
		System.out.println ("Digite o cpf do leitor: ");
		String cpf = input.nextLine();
		System.out.println ("Digite a matricula do leitor: ");
		int matricula = input.nextInt();
		return new Leitor(nome, cpf, matricula);
	}
	
	
	// METODO PARA CADASTRAR BIBLIOTECARIO
	public Bibliotecario cadastrarBibliotecario() {
		
		System.out.println ("Digite a nome do bibliotecario: ");
		String nome = input.nextLine();
		System.out.println ("Digite o cpf do bibliotecario: ");
		String cpf = input.nextLine();
		System.out.println ("Digite o turno do bibliotecario: ");
		String turno = input.nextLine();
		return new Bibliotecario(nome, cpf, turno);
	}
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDadosPessoa(Pessoa pessoa) {
		pessoa.mostrarDados();
	}
}
