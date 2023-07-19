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
public class DirecaoEletrica extends Acessorios {
   //private Carro veiculo;

    public DirecaoEletrica(Carro veiculo) {
        this.veiculo = veiculo;
    }

   
   
    @Override
    public String getDescricao() {
      return veiculo.getDescricao() + ",Direcao Eletrica";
    }

    @Override
    public double preco() {
       return 6000.00 + veiculo.preco();
    }
   
}
