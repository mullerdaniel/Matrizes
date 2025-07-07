package com.appbiclioteca;

import java.util.Scanner;
import com.appbiclioteca.model.*;
import com.appbiclioteca.service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        CadastroService cadastroService = new CadastroService();

        int opcao = 0;
		
		do {
		// MENU
		System.out.println ("\n--->Escolha quem você irá cadastrar<---");
		System.out.println ("\n+----------------+");
		System.out.println ("|1- Leitor       |");
		System.out.println ("|2- Bibliotecario|");
		System.out.println ("|0- Sair         |");
		System.out.println ("+----------------+");
		System.out.println ("Opção: ");
		opcao = input.nextInt();
		input.nextLine();
		
		
		 if (opcao == 1) {
	         Leitor leitor = cadastroService.cadastrarLeitor();
	         System.out.println("\nDados do Leitor:");
	         cadastroService.mostrarDadosPessoa(leitor);
		
		 }else if (opcao == 2) {
			 Bibliotecario bibliotecario = cadastroService.cadastrarBibliotecario();
			 System.out.println ("\nDados do Medico: ");
			 cadastroService.mostrarDadosPessoa(bibliotecario);
			 
		 }else if (opcao == 0) {
			 System.out.println ("Sistema Finalizado!");
			 
		 }else {
			 System.out.println ("Opção inválida!");
			 
		 }
		 
		 } while (opcao != 0);

		 Scanner close;
		
	}

}
