package com.appescola.service;

import java.util.Scanner;
import com.appescola.model.Pessoa;
import com.appescola.model.Aluno;
import com.appescola.model.Professor;

public class CadastroService {
	Scanner input = new Scanner(System.in);

	
	
	// METODO PARA CADASTRAR ALUNOS
	public Aluno cadastrarAluno() {
		
		System.out.println ("Digite o nome do aluno: ");
		String nome = input.nextLine();
		System.out.println ("Digite o email do aluno: ");
		String email = input.nextLine();
		System.out.println ("Digite a serie do aluno: ");
		String serie = input.nextLine();
		return new Aluno(nome, email, serie);
	}
	
	
	// METODO PARA CADASTRAR PROFESSOR
	public Professor cadastrarProfessor() {
		
		System.out.println ("Digite o nome do professor: ");
		String nome = input.nextLine();
		System.out.println ("Digite o email do professor: ");
		String email = input.nextLine();
		System.out.println ("Digite a disciplina do professor: ");
		String disciplina = input.nextLine();
		return new Professor(nome, email, disciplina);
	}
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDadosPessoa(Pessoa pessoa) {
		pessoa.mostrarDados();
	}
}
