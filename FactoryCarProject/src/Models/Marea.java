/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author japa
 */
public class Marea extends Carro{

    public Marea(String modelo, String marca, String acessorios, float valorVenda) {
        super(modelo, marca, acessorios, valorVenda);
    }

    @Override
    public String descricao() {
        return ("Carro explosivo imortal. 24 Válvulas.");
    }
    
    
}
