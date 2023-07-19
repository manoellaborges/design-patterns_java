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
public class KitTurbo extends Acessorios {
  // private Carro veiculo;

    public KitTurbo(Carro veiculo) {
        this.veiculo = veiculo;
    }

   
   
    @Override
    public String getDescricao() {
      return veiculo.getDescricao() + ",Kit Turbo";
    }

    @Override
    public double preco() {
       return 9000.00 + veiculo.preco();
    }
   
}
