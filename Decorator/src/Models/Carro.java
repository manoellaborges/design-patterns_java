/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author japa
 */
public abstract class Carro {
    String descricao="Carro";

    public String getDescricao() {
        return descricao;
    }
    
    public abstract double preco();
}
