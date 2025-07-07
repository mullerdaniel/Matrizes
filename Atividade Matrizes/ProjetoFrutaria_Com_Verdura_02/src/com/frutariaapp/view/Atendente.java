package com.frutariaapp.view;

import java.util.Scanner;

import com.frutariaapp.model.Fruta;
import com.frutariaapp.model.Verdura;

public class Atendente {

    private Scanner input;

    public Atendente() {
        input = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("\n|=============================|");
        System.out.println("|          Frutaria           |");
        System.out.println("|=============================|");
        System.out.println("|1- Cadastrar Fruta           |");
        System.out.println("|2- Cadastrar Verdura         |");
        System.out.println("|3- Listar Frutas             |");
        System.out.println("|4- Listar Verduras           |");
        System.out.println("|5- Listar Tudo               |");
        System.out.println("|6- Remover                   |");
        System.out.println("|0- Sair                      |");
        System.out.println("|_____________________________|");

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public String cadastrarNome() {
        System.out.println("\nNome: ");
        return input.nextLine();
    }

    public double cadastrarPreco() {
        System.out.println("Preço: ");
        return input.nextDouble();
    }

    public int cadastrarQuantidade() {
        System.out.println("Quantidade: ");
        return input.nextInt();
    }

    public double cadastrarPeso() {
        System.out.println("Peso: (em gramas)");
        return input.nextDouble();
    }

    public String cadastrarTipoVerdura() {
    	input.nextLine();
    	
        System.out.println("Tipo de Verdura: ");
        return input.nextLine();
    }

    public void listarFruta(Fruta fruta) {
        System.out.println("--------------------------");
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: " + fruta.getPreco() + "R$");
        System.out.println("Quantidade: " + fruta.getQuantidade());
        System.out.println("Peso: " + fruta.getPeso() + " Gramas");
    }

    public void listarVerdura(Verdura verdura) {
        System.out.println("--------------------------");
        System.out.println("Nome: " + verdura.getNome());
        System.out.println("Preço: " + verdura.getPreco());
        System.out.println("Quantidade: " + verdura.getQuantidade());
        System.out.println("Tipo: " + verdura.getTipo());
    }

    public String removerItem() {
        System.out.println("\nDigite o nome do item que você deseja remover: ");
        return input.nextLine();
    }

    public void visualizarItemRemovido(String nome) {
        System.out.println("\nO item " + nome + " foi removido.");
    }

    public void mensagemNaoEncontrada() {
        System.out.println("\nItem não encontrado.");
    }

    public void encerrarPrograma() {
        System.out.println("\n\nEncerrando o Programa...");
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
