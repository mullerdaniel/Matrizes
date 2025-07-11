package com.appcinema;

import java.util.Scanner;
import com.appcinema.model.*;
import com.appcinema.service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        CadastroService cadastroService = new CadastroService();

        int opcao = 0;
		
		do {
		// MENU
		System.out.println ("\n--->Escolha quem você irá cadastrar<---");
		System.out.println ("\n+--------------+");
		System.out.println ("|1- Cliente    |");
		System.out.println ("|2- Funcionario|");
		System.out.println ("|0- Sair       |");
		System.out.println ("+-------------+");
		System.out.println ("Opção: ");
		opcao = input.nextInt();
		input.nextLine();
		
		
		 if (opcao == 1) {
			 Cliente cliente = cadastroService.cadastrarCliente();
	         System.out.println("\nDados do Cliente:");
	         cadastroService.mostrarDados(cliente);
		
		 }else if (opcao == 2) {
			 Funcionario funcionario = cadastroService.cadastrarFuncionario();
	         System.out.println("\nDados do Funcionario:");
	         cadastroService.mostrarDados(funcionario);
			 
		 }else if (opcao == 0) {
			 System.out.println ("Sistema Finalizado!");
			 
		 }else {
			 System.out.println ("Opção inválida!");
			 
		 }
		 
		 } while (opcao != 0);

		 Scanner close;
		
	}

}
