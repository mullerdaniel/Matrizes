package com.appclinica.service;

import java.util.Scanner;
import com.appclinica.model.Pessoa;
import com.appclinica.model.Paciente;
import com.appclinica.model.Medico;

public class CadastroService {
	Scanner input = new Scanner (System.in);
	
	
	
	// METODO PARA CADASTRAR PACIENTE
	public Paciente cadastrarPaciente() {
		
		System.out.println ("Digite o nome do paciente: ");
		String nome = input.nextLine();
		System.out.println ("Digite o telefone do paciente: ");
		int telefone = input.nextInt();
		System.out.println ("Digite o plano de saúde do paciente: ");
		String planoSaude = input.nextLine();
		return new Paciente(nome, telefone, planoSaude);
	}
	
	
	// METODO PARA CADASTRAR MEDICO
	public Medico cadastrarMedico() {
		
		System.out.println ("Digite o nome do medico: ");
		String nome = input.nextLine();
		System.out.println ("Digite o telefone do medico: ");
		int telefone = input.nextInt();
		System.out.println ("Digite a especialidade do medico: ");
		String especialidade = input.nextLine();
		return new Medico(nome, telefone, especialidade);
	}
	
	
	// METODO PARA MOSTRAR OS DADOS
	public void mostrarDados(Pessoa pessoa) {
		pessoa.mostrarDados();
		
	}

}
