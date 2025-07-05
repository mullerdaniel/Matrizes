package com.appestacionamento.service;

import java.util.Scanner;
import com.appestacionamento.model.Veiculo;
import com.appestacionamento.model.Carro;
import com.appestacionamento.model.Moto;

public class CadastroService {
	Scanner input = new Scanner(System.in);

	
	
	// METODO PARA CADASTRAR CARRO
	public Carro cadastrarCarro() {
		
		System.out.println ("Digite a placa do carro: ");
		String placa = input.nextLine();
		System.out.println ("Digite a marca do carro: ");
		String marca = input.nextLine();
		System.out.println ("Digite a quantidade de portas do carro: ");
		int numeroDePostas = input.nextInt();
		return new Carro(placa, marca, numeroDePostas);
	}
	
	
	// METODO PARA CADASTRAR MOTO
	public Moto cadastrarMoto() {
		
		System.out.println ("Digite a placa da moto: ");
		String placa = input.nextLine();
		System.out.println ("Digite a marca da moto: ");
		String marca = input.nextLine();
		System.out.println ("Digite a quantidade de cilindradas da moto: ");
		int cilindrada = input.nextInt();
		return new Moto(placa, marca, cilindrada);
	}
	
	
	// METODO PARA MOSTRAR DADOS
	public void mostrarDadosPessoa(Veiculo veiculo) {
		veiculo.mostrarDados();
	}
}
