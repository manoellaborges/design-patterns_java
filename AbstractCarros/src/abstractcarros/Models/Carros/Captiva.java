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
public class Captiva extends Carro{

    public Captiva(ImpostosAbstractFactory impostos, String modelo, String marca, String acessorios, float valorVenda) {
        super(impostos, modelo, marca, acessorios, valorVenda);
    }

    @Override
    public String descricao() {
        return ("CAPTIVA\n"
                + "Modelo    : " + super.getModelo() + "\n" 
                + "Marca     : " + super.getMarca() + "\n"  
                + "Acessorios: " + super.getAcessorios() + "\n" 
                + "Valor   R$: " + super.getValorVenda() + "\n" 
                + "Descricao : Carro tipo SUV para 5 pessoas.\n"  
                + "Imposto   : " + impostos.getImpostos().ICMS());
    }
    
    
}
