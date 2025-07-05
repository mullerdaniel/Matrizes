package com.appestacionamento;

import java.util.Scanner;
import com.appestacionamento.model.*;
import com.appestacionamento.service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        CadastroService cadastroService = new CadastroService();

        int opcao = 0;
		
		do {
		// MENU
		System.out.println ("\n--->Escolha quem você irá cadastrar<---");
		System.out.println ("\n+-------------+");
		System.out.println ("|1- Carro     |");
		System.out.println ("|2- Moto      |");
		System.out.println ("|0- Sair      |");
		System.out.println ("+-------------+");
		System.out.println ("Opção: ");
		opcao = input.nextInt();
		input.nextLine();
		
		
		 if (opcao == 1) {
	         Carro carro = cadastroService.cadastrarCarro();
	         System.out.println("\nDados do carro:");
	         cadastroService.mostrarDadosPessoa(carro);
		
		 }else if (opcao == 2) {
			 Moto moto = cadastroService.cadastrarMoto();
			 System.out.println ("\nDados da moto: ");
			 cadastroService.mostrarDadosPessoa(moto);
			 
		 }else if (opcao == 0) {
			 System.out.println ("Sistema Finalizado!");
			 
		 }else {
			 System.out.println ("Opção inválida!");
			 
		 }
		 
		 } while (opcao != 0);

		 Scanner close;
		
	}

}
