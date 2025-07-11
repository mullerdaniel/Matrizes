package com.appacademia;

import java.util.Scanner;
import com.appacademia.model.*;
import com.appacademia.service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        CadastroService cadastroService = new CadastroService();

        int opcao = 0;
		
		do {
		// MENU
		System.out.println ("\n--->Escolha quem você irá cadastrar<---");
		System.out.println ("\n+---------------+");
		System.out.println ("|1- Aluno       |");
		System.out.println ("|2- Instrutor   |");
		System.out.println ("|0- Sair        |");
		System.out.println ("+---------------+");
		System.out.println ("Opção: ");
		opcao = input.nextInt();
		input.nextLine();
		
		
		 if (opcao == 1) {
			 Aluno aluno = cadastroService.cadastrarAluno();
	         System.out.println("\nDados do Aluno:");
	         cadastroService.mostrarDados(aluno);
		
		 }else if (opcao == 2) {
			 Instrutor instrutor = cadastroService.cadastrarInstrutor();
			 System.out.println ("\nDados do Instrutor: ");
			 cadastroService.mostrarDados(instrutor);
			 
		 }else if (opcao == 0) {
			 System.out.println ("Sistema Finalizado!");
			 
		 }else {
			 System.out.println ("Opção inválida!");
			 
		 }
		 
		 } while (opcao != 0);

		 Scanner close;
		
	}

}
