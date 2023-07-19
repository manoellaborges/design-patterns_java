/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractcarros.Models.Carros;

import abstractcarros.Factory.ImpostosAbstractFactory;

/**
 *
 * @author japa
 */
public abstract class Carro {
    private String modelo;
    private String marca;
    private String acessorios;
    private float valorVenda;
    ImpostosAbstractFactory impostos;

    public abstract String descricao();

    public Carro(ImpostosAbstractFactory impostos, String modelo, String marca, String acessorios, float valorVenda) {
        this.modelo = modelo;
        this.marca = marca;
        this.acessorios = acessorios;
        this.valorVenda = valorVenda;
        this.impostos = impostos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
}
