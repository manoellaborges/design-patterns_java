/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import Models.Carro;

/**
 *
 * @author japa
 */
public abstract class Acessorios extends Carro{
 protected Carro veiculo;
 public abstract String getDescricao();
    
}
