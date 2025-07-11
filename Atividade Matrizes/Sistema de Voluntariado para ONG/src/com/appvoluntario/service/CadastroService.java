package com.appvoluntario.service;

import java.util.Scanner;
import com.appvoluntario.model.Pessoa;
import com.appvoluntario.model.Voluntario;
import com.appvoluntario.model.Coordenador;

public class CadastroService {
	Scanner input = new Scanner (System.in);
	
	
	
	// METODO PARA CADASTRAR PACIENTE
	public Voluntario cadastrarVoluntario() {
		
		System.out.println ("Digite o nome do Voluntario: ");
		String nome = input.nextLine();
		System.out.println ("Digite a cidade do Voluntario: ");
		String cidade = input.nextLine();
		System.out.println ("Digite a area de atuação do Voluntario: ");
		String areaAtuacao = input.nextLine();
		return new Voluntario(nome, cidade, areaAtuacao);
	}
	
	
	// METODO PARA CADASTRAR MEDICO
	public Coordenador cadastrarCoordenador() {
		
		System.out.println ("Digite o nome do Voluntario: ");
		String nome = input.nextLine();
		System.out.println ("Digite a cidade do Voluntario: ");
		String cidade = input.nextLine();
		System.out.println ("Digite a responsabilidade do Coordenador: ");
		String responsabilidade = input.nextLine();
		return new Coordenador(nome, cidade, responsabilidade);
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados(Pessoa pessoa) {
		pessoa.mostrarDados();
		
	}

}
