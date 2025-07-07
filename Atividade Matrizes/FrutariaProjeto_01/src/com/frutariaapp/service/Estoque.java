package com.frutariaapp.service;

import java.util.List;
import java.util.ArrayList;
import com.frutariaapp.model.Fruta;
import com.frutariaapp.model.Verdura;
import com.frutariaapp.view.Atendente;

public class Estoque {

    List<Fruta> listaFrutas;
    List<Verdura> listaVerduras;

    public Estoque() {
        listaFrutas = new ArrayList<>();
        listaVerduras = new ArrayList<>();
    }

    public void gerenciarEstoque(int opcao, Atendente atendente) {

        switch (opcao) {
            // Cadastrar Fruta
            case 1 -> {
                String nome = atendente.cadastrarNome();
                double preco = atendente.cadastrarPreco();
                int quantidade = atendente.cadastrarQuantidade();
                String tipo = atendente.cadastrarTipo();

                Fruta fruta = new Fruta(nome, preco, quantidade, tipo);
                listaFrutas.add(fruta);
                System.out.println("Fruta cadastrada: " + fruta.getNome());
            }
            // Cadastrar Verdura
            case 2 -> {
                String nome = atendente.cadastrarNome();
                double preco = atendente.cadastrarPreco();
                int quantidade = atendente.cadastrarQuantidade();
                String tipo = atendente.cadastrarTipo();

                Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
                listaVerduras.add(verdura);
                System.out.println("Verdura cadastrada: " + verdura.getNome());
            }
            // Listar Frutas
            case 3 -> {
                if (listaFrutas.isEmpty()) {
                    System.out.println("Nenhuma fruta cadastrada.");
                } else {
                    for (Fruta fruta : listaFrutas) {
                        atendente.listar(fruta);  
                    }
                }
            }
            // Listar Verduras
            case 4 -> {
                if (listaVerduras.isEmpty()) {
                    System.out.println("Nenhuma verdura cadastrada.");
                } else {
                    for (Verdura verdura : listaVerduras) {
                        atendente.listar(verdura);  
                    }
                }
            }
            // Listar Tudo
            case 5 -> {
                if (listaFrutas.isEmpty() && listaVerduras.isEmpty()) {
                    System.out.println("Nenhum item cadastrado.");
                } else {
                    for (Fruta fruta : listaFrutas) {
                        atendente.listar(fruta);  
                    }
                    for (Verdura verdura : listaVerduras) {
                        atendente.listar(verdura);
                    }
                }
            }
            // Remover item
            case 6 -> {
                String nome = atendente.removerComida();
                boolean removido = false;

                for (int indice = 0; indice < listaFrutas.size(); indice++) {
                    if (listaFrutas.get(indice).getNome().equalsIgnoreCase(nome)) {
                        listaFrutas.remove(indice);
                        removido = true;
                        break;
                    }
                }

                if (!removido) {
                    for (int indice = 0; indice < listaVerduras.size(); indice++) {
                        if (listaVerduras.get(indice).getNome().equalsIgnoreCase(nome)) {
                            listaVerduras.remove(indice);
                            removido = true;
                            break;
                        }
                    }
                }

                if (removido) {
                    atendente.vizualizarFrutaRemovida(nome);
                } else {
                    atendente.mensagemNaoEncontrado();
                }
            }
            case 0 -> {
                break;
            }
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public List<Fruta> getEstoqueFruta() {
        return listaFrutas;
    }

    public void setEstoqueFruta(List<Fruta> estoqueFruta) {
        this.listaFrutas = estoqueFruta;
    }
    
    public List<Verdura> getEstoqueVerdura() {
        return listaVerduras;
    }

    public void setEstoqueVerdura(List<Verdura> estoqueVerdura) {
        this.listaVerduras = estoqueVerdura;
    }
}
