/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Decorator.Acessorios;

/**
 *
 * @author japa
 */
public class ArCondicionado extends Acessorios {
    //private Carro veiculo;
    public ArCondicionado(Carro veiculo) {
        this.veiculo = veiculo;
    }

   
   
    @Override
    public String getDescricao() {
      return veiculo.getDescricao() + ",Ar Condicionado";
    }

    @Override
    public double preco() {
       return 1000.00 + veiculo.preco();
    }
   
}
