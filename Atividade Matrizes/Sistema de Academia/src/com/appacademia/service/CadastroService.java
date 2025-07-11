package com.appacademia.service;

import java.util.Scanner;
import com.appacademia.model.Pessoa;
import com.appacademia.model.Aluno;
import com.appacademia.model.Instrutor;

public class CadastroService {
	Scanner input = new Scanner (System.in);
	
	
	
	// METODO PARA CADASTRAR PACIENTE
	public Aluno cadastrarAluno() {
		
		System.out.println ("Digite o nome do aluno: ");
		String nome = input.nextLine();
		System.out.println ("Digite a idade do aluno: ");
		int idade = input.nextInt();
		System.out.println ("Digite o objetivo do aluno: ");
		String Objetivo = input.nextLine();
		return new Aluno(nome, idade, Objetivo);
	}
	
	
	// METODO PARA CADASTRAR MEDICO
	public Instrutor cadastrarInstrutor() {
		
		System.out.println ("Digite o nome do instrutor: ");
		String nome = input.nextLine();
		System.out.println ("Digite a idade do instrutor: ");
		int idade = input.nextInt();
		System.out.println ("Digite a especialidade do instrutor: ");
		String especialidade = input.nextLine();
		return new Instrutor(nome, idade, especialidade);
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados(Pessoa pessoa) {
		pessoa.mostrarDados();
		
	}

}
