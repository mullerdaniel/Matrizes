package com.apppetshop.service;

import java.util.Scanner;
import com.apppetshop.model.Pessoa;
import com.apppetshop.model.Dono;
import com.apppetshop.model.Veterinario;

public class CadastroService {
	Scanner input = new Scanner (System.in);
	
	
	
	// METODO PARA CADASTRAR PACIENTE
	public Dono cadastrarDono() {
		
		System.out.println ("Digite o nome do Dono: ");
		String nome = input.nextLine();
		System.out.println ("Digite o telefone do Dono: ");
		int telefone = input.nextInt();
		System.out.println ("Digite o nome do Pet do Dono: ");
		String nomePet = input.nextLine();
		return new Dono(nome, telefone, nomePet);
	}
	
	
	// METODO PARA CADASTRAR MEDICO
	public Veterinario cadastrarVeterinario() {
		
		System.out.println ("Digite o nome do Veterinario: ");
		String nome = input.nextLine();
		System.out.println ("Digite o telefone do Veterinario: ");
		int telefone = input.nextInt();
		System.out.println ("Digite a registro Profissional do Veterinario: ");
		String registroProfissional = input.nextLine();
		return new Veterinario(nome, telefone, registroProfissional);
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados(Pessoa pessoa) {
		pessoa.mostrarDados();
		
	}

}
