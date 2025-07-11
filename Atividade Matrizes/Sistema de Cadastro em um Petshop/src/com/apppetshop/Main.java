package com.apppetshop;

import java.util.Scanner;
import com.apppetshop.model.*;
import com.apppetshop.service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        CadastroService cadastroService = new CadastroService();

        int opcao = 0;
		
		do {
		// MENU
		System.out.println ("\n--->Escolha quem você irá cadastrar<---");
		System.out.println ("\n+-------------+");
		System.out.println ("|1- Dono       |");
		System.out.println ("|2- Veterinario|");
		System.out.println ("|0- Sair       |");
		System.out.println ("+-------------+");
		System.out.println ("Opção: ");
		opcao = input.nextInt();
		input.nextLine();
		
		
		 if (opcao == 1) {
			 Dono dono = cadastroService.cadastrarDono();
	         System.out.println("\nDados do Dono:");
	         cadastroService.mostrarDados(dono);
		
		 }else if (opcao == 2) {
			 Veterinario veterinario = cadastroService.cadastrarVeterinario();
			 System.out.println ("\nDados do veterinario: ");
			 cadastroService.mostrarDados(veterinario);
			 
		 }else if (opcao == 0) {
			 System.out.println ("Sistema Finalizado!");
			 
		 }else {
			 System.out.println ("Opção inválida!");
			 
		 }
		 
		 } while (opcao != 0);

		 Scanner close;
		
	}

}
