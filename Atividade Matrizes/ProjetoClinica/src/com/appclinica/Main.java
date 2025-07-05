package com.appclinica;

import java.util.Scanner;
import com.appclinica.model.*;
import com.appclinica.service.CadastroService;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        CadastroService cadastroService = new CadastroService();

        int opcao = 0;
		
		do {
		// MENU
		System.out.println ("\n--->Escolha quem você irá cadastrar<---");
		System.out.println ("\n+-------------+");
		System.out.println ("|1- Paciente   |");
		System.out.println ("|2- Medico     |");
		System.out.println ("|0- Sair       |");
		System.out.println ("+-------------+");
		System.out.println ("Opção: ");
		opcao = input.nextInt();
		input.nextLine();
		
		
		 if (opcao == 1) {
	         Paciente paciente = cadastroService.cadastrarPaciente();
	         System.out.println("\nDados do Paciente:");
	         cadastroService.mostrarDados(paciente);
		
		 }else if (opcao == 2) {
			 Medico medico = cadastroService.cadastrarMedico();
			 System.out.println ("\nDados do Medico: ");
			 cadastroService.mostrarDados(medico);
			 
		 }else if (opcao == 0) {
			 System.out.println ("Sistema Finalizado!");
			 
		 }else {
			 System.out.println ("Opção inválida!");
			 
		 }
		 
		 } while (opcao != 0);

		 Scanner close;
		
	}

}
