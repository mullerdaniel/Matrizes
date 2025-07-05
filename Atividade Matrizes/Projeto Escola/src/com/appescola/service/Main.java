package com.appescola.service;

import java.util.Scanner;
import com.appescola.model.*;
import com.appescola.service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        CadastroService cadastroService = new CadastroService();

        int opcao = 0;
		
		do {
		// MENU
		System.out.println ("\n--->Escolha quem você irá cadastrar<---");
		System.out.println ("\n+-------------+");
		System.out.println ("|1- Aluno     |");
		System.out.println ("|2- Professor |");
		System.out.println ("|0- Sair      |");
		System.out.println ("+-------------+");
		System.out.println ("Opção: ");
		opcao = input.nextInt();
		input.nextLine();
		
		
		 if (opcao == 1) {
	         Aluno aluno = cadastroService.cadastrarAluno();
	         System.out.println("\nDados do Aluno:");
	         cadastroService.mostrarDadosPessoa(aluno);
		
		 }else if (opcao == 2) {
			 Professor professor = cadastroService.cadastrarProfessor();
			 System.out.println ("\nDados do Professor: ");
			 cadastroService.mostrarDadosPessoa(professor);
			 
		 }else if (opcao == 0) {
			 System.out.println ("Sistema Finalizado!");
			 
		 }else {
			 System.out.println ("Opção inválida!");
			 
		 }
		 
		 } while (opcao != 0);

		 Scanner close;
		
	}

}
