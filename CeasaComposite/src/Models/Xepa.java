/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Manoella Borges
 */
public class Xepa implements Produto{
    
    private String nome;
    private double valor;

    private ArrayList<Produto> produtos;

    public Xepa(String nome) {
        this.nome = nome;
        this.valor = 0;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        
    }    

    @Override
    public void imprimir() {
        System.out.println("Caixa: " + nome + " - Valor: " + valor);
        for (Produto produto : produtos) {
            produto.imprimir();
        }
    }
    
    
}
