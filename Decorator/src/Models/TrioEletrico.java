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
public class TrioEletrico extends Acessorios {
   //private Carro veiculo;

    public TrioEletrico(Carro veiculo) {
        this.veiculo = veiculo;
    }

   
   
    @Override
    public String getDescricao() {
      return veiculo.getDescricao() + ",Trio Eletrico";
    }

    @Override
    public double preco() {
       return 2300.00 + veiculo.preco();
    }
   
}
