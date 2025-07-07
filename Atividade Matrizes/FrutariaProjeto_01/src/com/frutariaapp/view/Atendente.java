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
        System.out.println("|=============================|");
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
        System.out.println("\n<--Cadastrar-->\n");
        System.out.println("Nome: ");
        String nome = input.nextLine();  
        return nome;
    }

    public double cadastrarPreco() {
        System.out.println("Preço: ");
        double preco = input.nextDouble();
        input.nextLine();  
        return preco;
    }

    public int cadastrarQuantidade() {
        System.out.println("Quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine(); 
        return quantidade;
    }
    
    public String cadastrarTipo() {
        System.out.println ("Tipo: ");
        String tipo = input.nextLine();
        return tipo;
    }

    // listar FRUTAS
    public void listar(Fruta fruta) {
        System.out.println("----------------------");
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: R$" + fruta.getPreco());
        System.out.println("Quantidade: " + fruta.getQuantidade());
        System.out.println("Tipo: " + fruta.getTipo());
    }
    
    // listar VERDURAS
    public void listar(Verdura verdura) {
        System.out.println("----------------------");
        System.out.println("Nome: " + verdura.getNome());
        System.out.println("Preço: R$" + verdura.getPreco());
        System.out.println("Quantidade: " + verdura.getQuantidade());
        System.out.println("Tipo: " + verdura.getTipo());
    }

    public String removerComida() {
        System.out.println("Digite o nome da fruta/verdura a remover:");
        return input.nextLine();
    }

    public void vizualizarFrutaRemovida(String nome) {
        System.out.println("A " + nome + "' foi removida.");
    }

    public void mensagemNaoEncontrado() {
        System.out.println("O item não foi encontrado.");
    }

    public void finalizarApp() {
        System.out.println("Sistema encerrado.");
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
