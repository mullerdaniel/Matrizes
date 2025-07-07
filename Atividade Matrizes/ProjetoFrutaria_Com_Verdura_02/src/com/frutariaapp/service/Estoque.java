package com.frutariaapp.service;

import java.util.List;
import java.util.ArrayList;

import com.frutariaapp.model.Fruta;
import com.frutariaapp.model.Verdura;
import com.frutariaapp.view.Atendente;

public class Estoque {

    private List<Fruta> estoqueFruta;
    private List<Verdura> estoqueVerdura;

    public Estoque() {
        estoqueFruta = new ArrayList<>();
        estoqueVerdura = new ArrayList<>();
    }

    public void GerenciarEstoque(int opcaoMenu, Atendente atendente) {

        switch (opcaoMenu) {
            case 1 -> {
                // Cadastrar Fruta
                String nome = atendente.cadastrarNome();
                double preco = atendente.cadastrarPreco();
                int quantidade = atendente.cadastrarQuantidade();
                double peso = atendente.cadastrarPeso();
                Fruta fruta = new Fruta(nome, preco, quantidade, peso);
                estoqueFruta.add(fruta);
            }

            case 2 -> {
                // Cadastrar Verdura
                String nome = atendente.cadastrarNome();
                double preco = atendente.cadastrarPreco();
                int quantidade = atendente.cadastrarQuantidade();
                String tipo = atendente.cadastrarTipoVerdura();
                Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
                estoqueVerdura.add(verdura);
            }

            case 3 -> {
                // Listar Frutas
                for (Fruta fruta : estoqueFruta) {
                    atendente.listarFruta(fruta);
                }
            }

            case 4 -> {
                // Listar Verduras
                for (Verdura verdura : estoqueVerdura) {
                    atendente.listarVerdura(verdura);
                }
            }

            case 5 -> {
                // Listar Tudo (Frutas e Verduras)
                System.out.println("\n\n===== Listagem de Frutas =====");
                for (Fruta fruta : estoqueFruta) {
                    atendente.listarFruta(fruta);
                }

                System.out.println("\n\n===== Listagem de Verduras =====");
                for (Verdura verdura : estoqueVerdura) {
                    atendente.listarVerdura(verdura);
                }
            }

            case 6 -> {
                // Remover Item
                String nome = atendente.removerItem();
                boolean removido = false;

                // Tenta remover uma fruta
                for (int indice = 0; indice < estoqueFruta.size(); indice++) {
                    if (estoqueFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
                        estoqueFruta.remove(indice);
                        removido = true;
                        break;
                    }
                }

                // Tenta remover uma verdura
                if (!removido) {
                    for (int indice = 0; indice < estoqueVerdura.size(); indice++) {
                        if (estoqueVerdura.get(indice).getNome().equalsIgnoreCase(nome)) {
                            estoqueVerdura.remove(indice);
                            removido = true;
                            break;
                        }
                    }
                }

                if (removido) {
                    atendente.visualizarItemRemovido(nome);
                } else {
                    atendente.mensagemNaoEncontrada();
                }
            }

            case 0 -> {
                // Sair
                atendente.encerrarPrograma();
            }

            default -> {
                System.out.println("\nOpção inválida.");
            }
        }
    }

    public List<Fruta> getEstoqueFruta() {
        return estoqueFruta;
    }

    public List<Verdura> getEstoqueVerdura() {
        return estoqueVerdura;
    }
}
