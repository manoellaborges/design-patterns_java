/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Manoella Borges
 */
public class Verdura implements Produto{
    
    private String nome;
    private double valor;

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

    public Verdura(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    

    @Override
    public void imprimir() {
        System.out.println("Verdura: " + nome + " - Valor: " + valor);
    }
    
}
